package com.mazurbeam.designtracker.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mazurbeam.designtracker.models.DesignActivity;

@Repository
public interface DesignActivityRepository extends CrudRepository<DesignActivity, Long>{

}
