package com.mazurbeam.designtracker.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import com.mazurbeam.designtracker.models.DesignActivity;
import com.mazurbeam.designtracker.models.Client;

@Entity
@Table(name="projects")
public class Project {
	@Id
    @GeneratedValue
    private Long id;
	
	private String title;
	
    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="user_id")
    private Client client;
	
	@OneToMany(mappedBy="project", fetch = FetchType.LAZY)
    private List<DesignActivity> activities;
	
	private Date createdAt;
    private Date updatedAt;
    
    public Project() {
    	
    }
    
	public Project(Long id, String title, Client client, List<DesignActivity> activities, Date createdAt,
			Date updatedAt) {
		super();
		this.id = id;
		this.title = title;
		this.client = client;
		this.activities = activities;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public List<DesignActivity> getActivities() {
		return activities;
	}
	public void setActivities(List<DesignActivity> activities) {
		this.activities = activities;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
    
	@PrePersist
    protected void onCreate(){
    this.setCreatedAt(new Date());
    }

    @PreUpdate
    protected void onUpdate(){
    this.setUpdatedAt(new Date());
    }
}
