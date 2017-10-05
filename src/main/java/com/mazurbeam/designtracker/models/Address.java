package com.mazurbeam.designtracker.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity
@Table(name="addresses")
public class Address {
	@Id
    @GeneratedValue
    private Long id;
	
	private String street;
	private String city;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="client_id")
    private Client client;
	
	private Date createdAt;
    private Date updatedAt;
    
    
    public Address() {
    	
    }
    
	public Address(Long id, String street, String city, Client client, Date createdAt, Date updatedAt) {
		super();
		this.id = id;
		this.street = street;
		this.city = city;
		this.client = client;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
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
