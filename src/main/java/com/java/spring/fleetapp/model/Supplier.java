package com.java.spring.fleetapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Supplier {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;
}
