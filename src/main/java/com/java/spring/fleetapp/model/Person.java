package com.java.spring.fleetapp.model;


import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
@MappedSuperclass
public class Person {
	
	

	public Person(Integer id, String firstname, String lastname, String othername, String title, String initials,
			String ssn, String gender, String maritialStatus, Country county, Integer countryid, States state,
			Integer stateid, Date dob, String city, String address, String phone, String mobile, String email,
			String photo) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.othername = othername;
		this.title = title;
		this.initials = initials;
		this.ssn = ssn;
		this.gender = gender;
		this.maritialStatus = maritialStatus;
		this.county = county;
		this.countryid = countryid;
		this.state = state;
		this.stateid = stateid;
		this.dob = dob;
		this.city = city;
		this.address = address;
		this.phone = phone;
		this.mobile = mobile;
		this.email = email;
		this.photo = photo;
	}
	
	
	
	public Person() {
		super();
	}



	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;
	String firstname;
	String lastname;
	String othername;
	String title;
	String initials;
	String ssn;
	String gender;
	String maritialStatus;
	
	@ManyToOne
	@JoinColumn(name="countryid",insertable=false,updatable=false)
	Country county;
	Integer countryid;
	
	@ManyToOne
	@JoinColumn(name="stateid",insertable=false,updatable=false)
	States state;
	Integer stateid;
	
	@DateTimeFormat(pattern="yyy-MM-dd")
	Date dob;
	
	String city;
	String address;
	String phone;
	String mobile;
	String email;
	String photo;
	@Override
	public String toString() {
		return "Person [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", othername=" + othername
				+ ", title=" + title + ", initials=" + initials + ", ssn=" + ssn + ", gender=" + gender
				+ ", maritialStatus=" + maritialStatus + ", county=" + county + ", countryid=" + countryid + ", state="
				+ state + ", stateid=" + stateid + ", dob=" + dob + ", city=" + city + ", address=" + address
				+ ", phone=" + phone + ", mobile=" + mobile + ", email=" + email + ", photo=" + photo + "]";
	}
	
	
	
	
}
