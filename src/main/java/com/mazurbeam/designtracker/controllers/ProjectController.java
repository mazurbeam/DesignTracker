package com.mazurbeam.designtracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mazurbeam.designtracker.models.Project;

@Controller
@RequestMapping("/projects")
public class ProjectController {

	@RequestMapping("/")
	public String projectDashboard(@ModelAttribute("project") Project project, Model model) {
		return "projectsdashboard.jsp";
	}
	
	@PostMapping("/newProject")
	public String newProject(@ModelAttribute("project") Project project, BindingResult result) {
		return "redirect:/projects";
	}
}
