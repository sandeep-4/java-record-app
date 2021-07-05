package com.java.spring.fleetapp.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.java.spring.fleetapp.service.EmployeeService;

@Controller
public class ProfileController {

	@Autowired
	EmployeeService employeeService;
	
	
	
	//this is the original one the below one is just a template since i am not able to login i am using the second one !!!
	
	
//	@RequestMapping(value="/profile")
//	public String profile(Model model,Principal principal) {
//		String username=principal.getName();
//		model.addAttribute("employee",employeeService.findByUsername(username));
//		return "profile";
//	}
//	

	@RequestMapping(value="/profile")
	public String profile(Model model,Principal principal) {
		String username="Demo user";
		model.addAttribute("employee",username);
		return "profile";
	}
	
}
