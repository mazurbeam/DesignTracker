package com.mazurbeam.designtracker.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mazurbeam.designtracker.models.Activity;

@RepositoryRestResource
public interface ActivityRepository extends JpaRepository<Activity, Long>{
	
	@Query(value="SELECT * FROM activities WHERE project_id=?1", nativeQuery=true)
	List<Activity> findAllActivitiesForProject(Long project_id);
	
	@Query(value="SELECT * FROM activities WHERE id=?1", nativeQuery=true)
	Activity getActivityById(Long id);
}
