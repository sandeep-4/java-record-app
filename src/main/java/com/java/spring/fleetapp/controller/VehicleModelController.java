package com.java.spring.fleetapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.java.spring.fleetapp.model.VehicleModel;
import com.java.spring.fleetapp.service.VehicleModelService;

@Controller
public class VehicleModelController {
	
	@Autowired
	VehicleModelService vechileModel;
	
	@RequestMapping(value="/vechilemodel",method=RequestMethod.GET)
	public String giveVehicleModel(Model model) {
	List<VehicleModel> vechileModelList=vechileModel.getAllVechileModels();
	model.addAttribute("vechileModellist",vechileModelList );
		
		return "vechileModel";
	}
	
	@RequestMapping(value="/vechilemodel/insert",method=RequestMethod.POST)
	public String insertvechileModel(VehicleModel vs) {
		
		VehicleModel status=vechileModel.save(vs);
		if(status!=null) {
			return "redirect:/vechileModel";
		}else {
			return "error inserting!!!";
		}
	}
		
		@RequestMapping(value="/vechilemodel/update",method= {RequestMethod.POST,RequestMethod.PUT})
		public String updateModel(VehicleModel vs) {
			
			VehicleModel modell=vechileModel.save(vs);
			if(modell!=null) {
				return "redirect:/vechileModel";
			}else {
				return "error updating!!!";
			}
		}
	
		@RequestMapping(value="/vechilemodel/id",method= RequestMethod.GET)
		@ResponseBody 
		public String getOne(int id) {
			vechileModel.getOneVechileModel(id);
			return "redirect:/vechileModel";
		}

		
		@RequestMapping(value="/vechilemodel/delete",method= {RequestMethod.POST,RequestMethod.DELETE})
		public String delete(int id) {
			vechileModel.delete(id);
			return "redirect:/vechileModel";
		}

		
	
}
