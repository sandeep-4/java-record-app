package com.java.spring.fleetapp.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@MappedSuperclass
//@JsonIdentityInfo(generator=ObjectIdGenerators.None.class, property="id")
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "@id")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class CommonObjects {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;
	String description;
	String details;
	
	
	
	public CommonObjects() {
		super();
	}
	public CommonObjects(Integer id, String description, String details) {
		super();
		this.id = id;
		this.description = description;
		this.details = details;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	@Override
	public String toString() {
		return "CommonObjects [id=" + id + ", description=" + description + ", details=" + details + "]";
	}
	
	
}
