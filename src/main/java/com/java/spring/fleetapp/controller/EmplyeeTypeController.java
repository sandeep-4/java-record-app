package com.java.spring.fleetapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.java.spring.fleetapp.model.EmployeeType;
import com.java.spring.fleetapp.service.EmployeeTypeService;

@Controller
public class EmplyeeTypeController {

	@Autowired
	EmployeeTypeService employeeType;
	
	@RequestMapping(value="/employeetype",method=RequestMethod.GET)
	public String giveEmployeeType(Model model) {
	List<EmployeeType> employeeTypeList=employeeType.getAllEmployeeTypes();
	model.addAttribute("employeeTypelist",employeeTypeList );
		
		return "employeeType";
	}
	
	@RequestMapping(value="/employeetype/insert",method=RequestMethod.POST)
	public String insertemployeeType(EmployeeType vm) {
		
		EmployeeType status=employeeType.save(vm);
		if(status!=null) {
			return "redirect:/employeeType";
		}else {
			return "error inserting!!!";
		}
	}
		
		@RequestMapping(value="/employeetype/update",method= {RequestMethod.POST,RequestMethod.PUT})
		public String updateStatus(EmployeeType vs) {
			
			EmployeeType status=employeeType.save(vs);
			if(status!=null) {
				return "redirect:/employeeType";
			}else {
				return "error updating!!!";
			}
		}
	
		
		
		@RequestMapping(value="/employeetype/delete",method= {RequestMethod.POST,RequestMethod.DELETE})
		public String delete(int id) {
			employeeType.delete(id);
			return "redirect:/employeeType";
		}
	
	
	
	
	
	
	
	
	
	

}
