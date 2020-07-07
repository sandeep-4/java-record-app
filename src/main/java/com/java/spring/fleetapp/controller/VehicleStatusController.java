package com.java.spring.fleetapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.java.spring.fleetapp.model.VechileStatus;
import com.java.spring.fleetapp.service.VehicleStatusService;

@Controller
public class VehicleStatusController {

	@Autowired
	VehicleStatusService vechileStatus;
	
	@RequestMapping(value="/vechilestatus",method=RequestMethod.GET)
	public String giveVechileStatus(Model model) {
	List<VechileStatus> vechileStatusList=vechileStatus.getAllVechileStatus();
	model.addAttribute("vechileStatuslist",vechileStatusList );
		
		return "VechileStatus";
	}
	
	@RequestMapping(value="/vechilestatus/insert",method=RequestMethod.POST)
	public String insertvechileStatus(VechileStatus vs) {
		
		VechileStatus status=vechileStatus.save(vs);
		if(status!=null) {
			return "redirect:/VechileStatus";
		}else {
			return "error inserting!!!";
		}
	}
		
		@RequestMapping(value="/vechilestatus/update",method= {RequestMethod.POST,RequestMethod.PUT})
		public String updateStatus(VechileStatus vs) {
			
			VechileStatus status=vechileStatus.save(vs);
			if(status!=null) {
				return "redirect:/VechileStatus";
			}else {
				return "error updating!!!";
			}
		}
	
		
		
		@RequestMapping(value="/vechilestatus/delete",method= {RequestMethod.POST,RequestMethod.DELETE})
		public String delete(int id) {
			vechileStatus.delete(id);
			return "redirect:/VechileStatus";
		}

		
		
		
		
		
		
		
	}

	
	
	

