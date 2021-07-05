package com.java.spring.fleetapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.spring.fleetapp.model.Employee;
import com.java.spring.fleetapp.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository empRepo;
	
	public Employee saveEmployee(Employee emp) {
		return empRepo.save(emp);
	}
	public void saveEmployees(Employee emp) {
		 empRepo.save(emp);
	}
	
	public Employee getOne(int id) {
		return empRepo.getOne(id);
	}
	
	public List<Employee> getAll(){
	return	empRepo.findAll();
	}
	
	public void deleye(int id) {
		 empRepo.deleteById(id);
	}
	
	public Employee findByUsername(String username) {
		return empRepo.findByUsername(username);
	}
	
}
