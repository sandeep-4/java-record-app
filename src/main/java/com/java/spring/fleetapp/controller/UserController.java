package com.java.spring.fleetapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.java.spring.fleetapp.model.User;
import com.java.spring.fleetapp.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@Autowired BCryptPasswordEncoder bcrypt;
	
	
	@GetMapping("/user")
	public String giveUser() {
		return "user";
	}
	
//	@RequestMapping(value="/users/register",method=RequestMethod.POST)
//	public String registerUser(User user) {
//		User users= userService.save(user);
//		if(users!=null) {
//			return "redirect:/login";
//		}
//		else {
//			return "redirect:/register";
//		}
//	}
	
	@RequestMapping(value="/users/register",method=RequestMethod.POST)
	public RedirectView registerUser(User user,RedirectAttributes attr) {
		user.setPassword(bcrypt.encode(user.getPassword()));
		userService.save(user);
		
		RedirectView rv=new RedirectView("/login",true);
		
		rv.addStaticAttribute("message","you are registered !!!");
		
		return rv;
	}

}
