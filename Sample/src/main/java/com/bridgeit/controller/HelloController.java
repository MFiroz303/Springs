package com.bridgeit.controller;

import java.util.HashMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/agree")
public class HelloController {
	
	@RequestMapping(value="/hello/{countryName}/{userName}", method = RequestMethod.GET)
	public ModelAndView helloWorld(@PathVariable HashMap<String, String> pathvars) {
		
		String name = pathvars.get("userName");
		String country = pathvars.get("countryName"); 
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("welcomeMessage", " hello "  +name+ " you are from " +country);
		return model;
	}
	
	@RequestMapping(value ="/hi", method = RequestMethod.GET)
	public ModelAndView hioworld(){
	ModelAndView model1 = new ModelAndView("HelloPage");
	model1.addObject("welcomeMessage", "hi, I am Firoz");
	return model1;
	}	
}
