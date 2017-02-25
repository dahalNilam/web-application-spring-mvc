package com.nilam.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Welcome to Spring MVC Web Application");
		return "hello";

	}

	// @RequestMapping(value = "/hello/{name:.+}", method = RequestMethod.GET)
	// public ModelAndView hello(@PathVariable("name") String name) {
	//
	// ModelAndView model = new ModelAndView();
	// model.setViewName("hello");
	// model.addObject("msg", name);
	//
	// return model;
	//
	// }

}
