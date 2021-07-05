package com.java.spring.fleetapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.spring.fleetapp.model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

	public Employee findByUsername(String username);
}
