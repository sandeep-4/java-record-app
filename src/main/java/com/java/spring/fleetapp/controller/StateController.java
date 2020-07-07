package com.java.spring.fleetapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.java.spring.fleetapp.model.States;
import com.java.spring.fleetapp.service.StateService;

@Controller
public class StateController {
	
	
	@Autowired
	StateService stateServcie;
	
	
	@RequestMapping(value="/state",method=RequestMethod.GET)
	public String giveStates(Model model) {
		
		List<States> getAll=stateServcie.allStates();
		model.addAttribute("statemodel",getAll);
		
		return "state";
	}
	
	 
	
	
	@RequestMapping(value="/state/id",method=RequestMethod.GET)
	public States getOne(int id) {
		return stateServcie.getOne(id);
	}


	@RequestMapping(value="/state/insert",method=RequestMethod.POST)
	public String insert(States state) {
		 States st=stateServcie.saveStates(state);
		 if(st!=null) {
			 return "redirect:/state";
		 }
		 else{
			 return "unsucessful !!";
		 }
	}

	
	@RequestMapping(value="/state/update",method= {RequestMethod.GET,RequestMethod.PUT})
	public String update(States state) {
		States update=stateServcie.saveStates(state);
		 if(update!=null) {
			 return "redirect:/state";
		 }
		 else{
			 return "unsucessful !!";
		 }
	}

	

	
	@RequestMapping(value="/state/delete",method= {RequestMethod.GET,RequestMethod.DELETE})
	public String delete(int id) {
		stateServcie.delete(id);
		return "redirect:/state";
	}

	
	
	
	
}
