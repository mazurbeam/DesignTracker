package com.mazurbeam.designtracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mazurbeam.designtracker.models.*;
import com.mazurbeam.designtracker.services.*;


@Controller
@RequestMapping("/projects")
public class ProjectController {
	
	private ClientService clientService;
	private ProjectService projectService;
	
	

	public ProjectController(ClientService clientService, ProjectService projectService) {
		super();
		this.clientService = clientService;
		this.projectService = projectService;
	}

	@RequestMapping("/")
	public String projectDashboard(@ModelAttribute("project") Project project, Model model) {
		model.addAttribute("clients", clientService.findAllClients());
		model.addAttribute("projects", projectService.getAllProjects());
		return "projectsdashboard.jsp";
	}
	
	@PostMapping("/newProject")
	public String newProject(@ModelAttribute("project") Project project, BindingResult result) {
		System.out.println(project.getTitle());
		if(result.hasErrors()) {
			return "projectsdashboard.jsp";
		}
		projectService.saveProject(project);
		return "redirect:/projects/";
	}
}
