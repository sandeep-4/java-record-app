package com.java.spring.fleetapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Entity
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class Client {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;
	
	String name;
	String details;
	String website;
	String address;
	String state;
	String country;
	String city;
	String phone;
	String mobile;
	String email;
	public Client(Integer id, String name, String details, String website, String address, String state, String country,
			String city, String phone, String mobile, String email) {
		super();
		this.id = id;
		this.name = name;
		this.details = details;
		this.website = website;
		this.address = address;
		this.state = state;
		this.country = country;
		this.city = city;
		this.phone = phone;
		this.mobile = mobile;
		this.email = email;
	}
	public Client() {
		super();
	}
	
	
	
}
