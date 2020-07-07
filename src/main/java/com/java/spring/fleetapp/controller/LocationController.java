package com.java.spring.fleetapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.java.spring.fleetapp.model.Country;
import com.java.spring.fleetapp.model.Location;
import com.java.spring.fleetapp.model.States;
import com.java.spring.fleetapp.service.CountryService;
import com.java.spring.fleetapp.service.LocationService;
import com.java.spring.fleetapp.service.StateService;

@Controller
public class LocationController {


	@Autowired
	LocationService locationService;
	
	@Autowired StateService stateService;
	@Autowired CountryService countryService;
	
	@GetMapping("/location")
	public String openLocation(Model model) {
		
		List<States> stateList=stateService.allStates();
		List<Country> countryList=countryService.getAllCountries();
		List<Location> locationList= locationService.getAllLocations();
		
		model.addAttribute("locationlist",locationList);      //this will go into the loop in html page
		model.addAttribute("statelist", stateList);
		model.addAttribute("countrylist", countryList);
		
		return "location";
	}
	
	@PostMapping("/location/insert")
	public String insert(Location c) {
	locationService.saveLocation(c);
	return "redirect:/location";
	}
	
@GetMapping("/Location/id")
@ResponseBody
public Location getoneLocation(int id) {
	return locationService.getOneLocation(id);
	
}
	
	

@RequestMapping(value="/location/update",method= {RequestMethod.GET,RequestMethod.PUT})
public String updateLocation(Location location) {
	Location c= locationService.save(location);
	if(c!=null) {
		return "redirect:/Location";
//		return ResponseEntity.ok().body(Location);
	}
	else {
		return "cant be updated!!!";
		//return ResponseEntity.ok().build();
	}
}


@RequestMapping(value="/location/delete",method= {RequestMethod.GET,RequestMethod.DELETE})
public String deleteLocation(int id) {
	locationService.delete(id);
	return "redirect:/location";
}
}
