package com.mazurbeam.designtracker.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mazurbeam.designtracker.models.Project;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long>{
	List<Project> findAll();
}
