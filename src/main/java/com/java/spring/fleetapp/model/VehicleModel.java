package com.java.spring.fleetapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
public class VehicleModel extends CommonObjects{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;
}
