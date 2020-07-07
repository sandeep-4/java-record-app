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
import com.java.spring.fleetapp.service.CountryService;

@Controller
public class CountryController {

	@Autowired
	CountryService countryService;
	
	@GetMapping("/country")
	public String openCountry(Model model) {
		
		List<Country> countrylist= countryService.getAllCountries();
		model.addAttribute("countrylist",countrylist);      //this will go into the loop in html page
		
		return "country";
	}
	
	@PostMapping("/country/insert")
	public String insert(Country c) {
	countryService.saveCountry(c);
	return "redirect:/country";
	}
	
@GetMapping("/country/id")
@ResponseBody
public Country getoneCountry(int id) {
	return countryService.getOneCountry(id);
	
}
	
	

//@RequestMapping(value="/country/update",method= {RequestMethod.GET,RequestMethod.PUT})
//public ResponseEntity<Country> updateCountry(Country country) {
//	Country c= countryService.save(country);
//	if(c!=null) {
////		"redirect:/country";
//		return ResponseEntity.ok().body(country);
//	}
//	else {
//		return ResponseEntity.ok().build();
//	}
//}

@RequestMapping(value="/country/update",method= {RequestMethod.GET,RequestMethod.PUT})
public String updateCountry(Country country) {
	Country c= countryService.save(country);
	if(c!=null) {
		return "redirect:/country";
//		return ResponseEntity.ok().body(country);
	}
	else {
		return "cant be updated!!!";
		//return ResponseEntity.ok().build();
	}
}


@RequestMapping(value="/country/delete",method= {RequestMethod.GET,RequestMethod.DELETE})
public String deleteCountry(int id) {
	countryService.delete(id);
	return "redirect:/country";
}

}
