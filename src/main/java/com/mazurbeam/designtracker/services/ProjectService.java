package com.mazurbeam.designtracker.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mazurbeam.designtracker.models.Project;
import com.mazurbeam.designtracker.repositories.ProjectRepository;

@Service
public class ProjectService {
	
	private ProjectRepository projectRepository;

	public ProjectService(ProjectRepository projectRepository) {
		super();
		this.projectRepository = projectRepository;
	}
	
	public void saveProject(Project project) {
		projectRepository.save(project);
	}
	
	public List<Project> getAllProjects(){
		return projectRepository.findAll();
	}
	
}
