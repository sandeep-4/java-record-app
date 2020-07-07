package com.java.spring.fleetapp.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class Employee extends Auditable<String>{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;
	String firstname;
	String lastname;
	String photo;
	String username;
	String jobtitle;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	Date hiredate;
	public Employee(Integer id, String firstname, String lastname, String photo, String username, String jobtitle,
			Date hiredate) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.photo = photo;
		this.username = username;
		this.jobtitle = jobtitle;
		this.hiredate = hiredate;
	}
	public Employee() {
		super();
	}
	
	
}
