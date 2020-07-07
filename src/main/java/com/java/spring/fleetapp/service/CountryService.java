package com.java.spring.fleetapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.spring.fleetapp.model.Country;
import com.java.spring.fleetapp.repository.CountryRepository;

@Service
public class CountryService {

	@Autowired
	CountryRepository countryRepo;
	
	
	public List<Country> getAllCountries(){
		return countryRepo.findAll();
	}
		
	public void saveCountry(Country c) {
		 countryRepo.save(c);
		}
	
	public Country getOneCountry(int id) {
	return	countryRepo.getOne(id);
	}
	
	public Country save(Country c) {
		return countryRepo.save(c);
		}
	
	public void delete(int id) {
		countryRepo.deleteById(id);
	}
}
