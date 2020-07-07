package com.java.spring.fleetapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.spring.fleetapp.model.EmployeeType;
import com.java.spring.fleetapp.repository.EmployeeTypeRepository;

@Service
public class EmployeeTypeService {

	@Autowired
	EmployeeTypeRepository employeeTypeRepo;
	
	public List<EmployeeType> getAllEmployeeTypes(){
		return employeeTypeRepo.findAll();
	}
		
	public void saveEmployeeType(EmployeeType emp) {
		 employeeTypeRepo.save(emp);
		}
	
	public EmployeeType getOneEmployeeType(int id) {
	return	employeeTypeRepo.getOne(id);
	}
	
	public EmployeeType save(EmployeeType emp) {
		return employeeTypeRepo.save(emp);
		}
	
	public void delete(int id) {
		employeeTypeRepo.deleteById(id);
	}
	
}
