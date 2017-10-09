package com.mazurbeam.designtracker.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PostMapping("/new")
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<?> newProject(ModelMap model, @RequestBody Project newProject, HttpServletRequest request) {
		System.out.println("creating new project");
		repository.save(newProject);
		
		return new ResponseEntity<String>("success", HttpStatus.CREATED);
	}
	
	@RequestMapping("/get/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public Project getProject(@PathVariable ("id") Long id) {
		System.out.println("Retrieving project");
		return repository.findOne(id);
	}
}
