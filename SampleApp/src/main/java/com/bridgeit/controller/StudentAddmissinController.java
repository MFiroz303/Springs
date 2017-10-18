package com.bridgeit.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAddmissinController {

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		// binder.setDisallowedFields(new String[] { "studentMobile" });
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
		binder.registerCustomEditor(Date.class, "studentDOB", new CustomDateEditor(dateFormat, false));
		binder.registerCustomEditor(String.class, "studentName", new StudentNameEditor());

	}

	@RequestMapping(value = "/admissionform.html", method = RequestMethod.GET)
	public ModelAndView getAddmissionForm() {
		ModelAndView model1 = new ModelAndView("admission");
		return model1;
	}

	@ModelAttribute
	public void addCommonObjects(Model model1) {
		model1.addAttribute("message", "BridgeLabz, Mumbai");
	}

	@RequestMapping(value = "/studentAdmissionform.html", method = RequestMethod.POST)
	public ModelAndView submitAddmissionForm(@Valid @ModelAttribute("student") Student student, BindingResult result) {

		if (result.hasErrors()) {
			ModelAndView model1 = new ModelAndView("admission");
			return model1;
		}

		ModelAndView model1 = new ModelAndView("admissionDone");
		return model1;

	}

}