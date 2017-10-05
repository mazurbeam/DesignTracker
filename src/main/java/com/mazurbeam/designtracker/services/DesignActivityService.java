package com.mazurbeam.designtracker.services;

import org.springframework.stereotype.Service;

import com.mazurbeam.designtracker.models.DesignActivity;
import com.mazurbeam.designtracker.repositories.DesignActivityRepository;

@Service
public class DesignActivityService {
	
	private DesignActivityRepository designActivityRepository;

	public DesignActivityService(DesignActivityRepository designActivityRepository) {
		super();
		this.designActivityRepository = designActivityRepository;
	}
	
	public void saveDesignActivity(DesignActivity activity) {
		designActivityRepository.save(activity);
	}
}
