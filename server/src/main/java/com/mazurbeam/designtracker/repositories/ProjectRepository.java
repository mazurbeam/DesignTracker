package com.mazurbeam.designtracker.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mazurbeam.designtracker.models.Project;

@RepositoryRestResource
public interface ProjectRepository extends JpaRepository<Project, Long>{
	
	Project findOne(Long id);
	List<Project> findAll();
	
	
}
