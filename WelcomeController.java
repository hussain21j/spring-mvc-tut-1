package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 * @author Hussain
 * This class act as the controller. This controller
 */

public class WelcomeController extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		ModelAndView modelAndView = new ModelAndView("welcome");
		modelAndView.addObject("message", "welcome to the world of spring");
		return modelAndView;
	}
}
