package com.java.spring.fleetapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Location {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;
	
	String address;
	String city;
	String country;
	 
	
	 String description;
	 String details;
	 
		int countryid;

	public Location(Integer id, String address, String city, String country, int countryid, String description,
			String details) {
		super();
		this.id = id;
		this.address = address;
		this.city = city;
		this.country = country;
		this.countryid = countryid;
		this.description = description;
		this.details = details;
	}
	public Location() {
		super();
	}
	@Override
	public String toString() {
		return "Location [id=" + id + ", address=" + address + ", city=" + city + ", country=" + country
				+ ", countryid=" + countryid + ", description=" + description + ", details=" + details + "]";
	}
	 
	 
}
