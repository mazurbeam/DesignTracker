package com.mazurbeam.designtracker.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mazurbeam.designtracker.models.Project;
import com.mazurbeam.designtracker.repositories.ProjectRepository;

@RestController
@RequestMapping("/projects")
public class ProjectController {
	
	private ProjectRepository repository;
	
	public ProjectController(ProjectRepository repository) {
		this.repository = repository;
	}
	
	@RequestMapping("/all")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Project> findAllProjects() {
		return repository.findAll();
	}
}
