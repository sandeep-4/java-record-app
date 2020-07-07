package com.java.spring.fleetapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.java.spring.fleetapp.model.Employee;
import com.java.spring.fleetapp.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService empService;
	
	
	@RequestMapping(value="/employee",method=RequestMethod.GET)
	public String getAll(Model model) {
		List<Employee> employeeList=empService.getAll();
		model.addAttribute("employeelist",employeeList);
		return "employee";
	}
	
	
	@RequestMapping(value="/employee/insert",method=RequestMethod.POST)
	public String insertEmployee(Employee emp) {
		Employee e=empService.saveEmployee(emp);
		if(e!=null) {
			return "redirect:/employee";

		}else {
			return "error inserting";
		}
 
	}
	
	@RequestMapping(value="/employee/id",method=RequestMethod.GET)
	@ResponseBody
	public Employee getOne(int id) {
		return empService.getOne(id);
	}
	
	
	@RequestMapping(value="/employee/update",method= {RequestMethod.PUT,RequestMethod.GET})
	public String updateEmployee(Employee emp) {
		Employee e=empService.saveEmployee(emp);
		if(e!=null) {
			return "redirect:/employee";

		}else {
			return "error updating";
		}
 
	}

	@RequestMapping(value="/employee/delete",method= {RequestMethod.DELETE,RequestMethod.GET})
	public String delete(int id) {
	empService.deleye(id);
	return "redirect:/employee";
	}
	
	
	
	
	
	
	
	
	
//	@GetMapping("/employee")
//	public String getEmployee() {
//		return "employee";
//	}
}
