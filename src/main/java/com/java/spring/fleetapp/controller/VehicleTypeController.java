package com.java.spring.fleetapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.java.spring.fleetapp.model.VehicleType;

import com.java.spring.fleetapp.service.VehicleTypeService;

@Controller
public class VehicleTypeController {
	
	
	
	@Autowired
	VehicleTypeService VechileType;
	
	@RequestMapping(value="/vechiletype",method=RequestMethod.GET)
	public String giveVehicleType(Model model) {
	List<VehicleType> VechileTypeList=VechileType.getAllVehicleTypes();
	model.addAttribute("VechileTypelist",VechileTypeList );
		
		return "VechileType";
	}
	
	@RequestMapping(value="/vechiletype/insert",method=RequestMethod.POST)
	public String insertVechileType(VehicleType vs) {
		
		VehicleType status=VechileType.save(vs);
		if(status!=null) {
			return "redirect:/vechiletype";
		}else {
			return "error inserting!!!";
		}
	}
		
		@RequestMapping(value="/vechiletype/update",method= {RequestMethod.GET,RequestMethod.PUT})
		public String updateStatus(VehicleType vs) {
			
			VehicleType status=VechileType.save(vs);
			if(status!=null) {
				return "redirect:/vechiletype";
			}else {
				return "error updating!!!";
			}
		}
	
		
		
		@RequestMapping(value="/vechiletype/delete",method= {RequestMethod.GET,RequestMethod.DELETE})
		public String delete(int id) {
			VechileType.delete(id);
			return "redirect:/vechiletype";
		}

}
