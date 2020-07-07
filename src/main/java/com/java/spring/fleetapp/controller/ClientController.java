package com.java.spring.fleetapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.java.spring.fleetapp.model.Client;
import com.java.spring.fleetapp.service.ClientService;

@Controller
public class ClientController {

	
	@Autowired
	ClientService clientService;
	
	@RequestMapping(value="/client",method=RequestMethod.GET)
	public String getaAllClinetd(Model model) {
		List<Client> getAllClinets=clientService.findAllClients();
		model.addAttribute("clientlist",getAllClinets);
		
		return "client";
		
	}
	
	@RequestMapping(value="/client/insert",method= {RequestMethod.GET,RequestMethod.POST})
	public String insertClient(Client client) {
		Client ci=clientService.save(client);
		if(ci!=null) {
			return "redirect:/client";
		}
		else {
			return "error files";
		}
	}
	
	@RequestMapping(value="/client/update",method= {RequestMethod.GET,RequestMethod.PUT})
	public String updateClient(Client client) {
		Client ci=clientService.save(client);
		if(ci!=null) {
			return "redirect:/client";
		}
		else {
			return "error files";
		}
	}
	
	@RequestMapping(value="/client/delete",method=RequestMethod.DELETE)
	public String delete(int id) {
		clientService.delete(id);
		return "redirect:/client";
	}
	
	@GetMapping("/client/id")
	@ResponseBody
	public Client getoneCountry(int id) {
		return clientService.getOne(id);
		
	}
		
	
//	@GetMapping("/client")
//	public String getClient() {
//		return "client";
//	}
}
