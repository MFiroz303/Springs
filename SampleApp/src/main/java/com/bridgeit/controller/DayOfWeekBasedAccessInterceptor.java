package com.bridgeit.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DayOfWeekBasedAccessInterceptor extends HandlerInterceptorAdapter {

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object hndler) throws Exception {

		Calendar calendar = Calendar.getInstance();

		int dayOfWeek = calendar.get(calendar.DAY_OF_WEEK);

		if (dayOfWeek == 1) {
			response.getWriter()
					.write("The Website is closed on Sunday; please try accessing it" + "on any other week Day!!");
			return false;
		}
		return true;

	}
}
