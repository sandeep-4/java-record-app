package com.java.spring.fleetapp.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class Country {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;
String code;
String capital;
String description;
String nationality;
String continenet;

@OneToMany(mappedBy="country")
List<States> states;



	
	public Country() {
	super();
}
	public Country(Integer id, String code, String capital, String description, String nationality, String continenet) {
	super();
	this.id = id;
	this.code = code;
	this.capital = capital;
	this.description = description;
	this.nationality = nationality;
	this.continenet = continenet;
}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getContinenet() {
		return continenet;
	}
	public void setContinenet(String continenet) {
		this.continenet = continenet;
	}
	@Override
	public String toString() {
		return "Country [id=" + id + ", code=" + code + ", capital=" + capital + ", description=" + description
				+ ", nationality=" + nationality + ", continenet=" + continenet + "]";
	}
	

}
