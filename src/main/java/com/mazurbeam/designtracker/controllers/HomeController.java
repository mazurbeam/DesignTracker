package com.mazurbeam.designtracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String dashboard() {
		return "dashboard.jsp";
	}
}
