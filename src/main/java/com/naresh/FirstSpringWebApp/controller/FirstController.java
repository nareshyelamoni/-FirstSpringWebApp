package com.naresh.FirstSpringWebApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {
	@RequestMapping("/welcome")
	public ModelAndView displaySomeResponse() {
		ModelAndView mav=new ModelAndView();
		mav.addObject("message", "Hello, Welcome to our first web app");
		mav.setViewName("index");
		return mav;
	}
}
