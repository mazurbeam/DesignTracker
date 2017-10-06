package com.mazurbeam.designtracker.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="projects")
public class Project {
	@Id
    @GeneratedValue
    private Long id;
    private String name;
    private String client;
    private String address;
    
    @OneToMany(mappedBy="project", fetch = FetchType.LAZY)
    private List<Activity> activities;
    
    public Project() {
    	
    }

	public Project(String name, String client, String address, List<Activity> activities) {
		this.name = name;
		this.client = client;
		this.address = address;
		this.activities = activities;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Activity> getActivities() {
		return activities;
	}

	public void setActivities(List<Activity> activities) {
		this.activities = activities;
	}
	
	
    
    
}
