package com.mazurbeam.designtracker.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mazurbeam.designtracker.repositories.ActivityRepository;

@RestController
@RequestMapping("/activities")
public class ActivityController {
	
	private ActivityRepository activityRepository;
	
	public ActivityController(ActivityRepository activityRepository) {
		this.activityRepository = activityRepository;
	}
}
