package com.java.spring.fleetapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.java.spring.fleetapp.model.VechileMake;
import com.java.spring.fleetapp.service.VehicleMakeService;

@Controller
public class VehicleMakeController {
	
	@Autowired
	VehicleMakeService vechileMake;
	
	@RequestMapping(value="/vechilemake",method=RequestMethod.GET)
	public String giveVechileMake(Model model) {
	List<VechileMake> vechileMakeList=vechileMake.getAllVehicleMakes();
	model.addAttribute("vechileMakelist",vechileMakeList );
		
		return "vechileMake";
	}
	
	@RequestMapping(value="/vechilemake/insert",method=RequestMethod.POST)
	public String insertvechileMake(VechileMake vm) {
		
		VechileMake status=vechileMake.save(vm);
		if(status!=null) {
			return "redirect:/vechilemake";
		}else {
			return "error inserting!!!";
		}
	}
		
		@RequestMapping(value="/vechilemake/update",method= {RequestMethod.GET,RequestMethod.PUT})
		public String updateStatus(VechileMake vs) {
			
			VechileMake status=vechileMake.save(vs);
			if(status!=null) {
				return "redirect:/vechilemake";
			}else {
				return "error updating!!!";
			}
		}
	
		
		
		@RequestMapping(value="/vechilemake/delete",method= {RequestMethod.GET,RequestMethod.DELETE})
		public String delete(int id) {
			vechileMake.delete(id);
			return "redirect:/vechilemake";
		}

		
//			@GetMapping("/vechilemake")
//	public String giveVechileMake() {
//		return "vechileMake";
//	}
}
