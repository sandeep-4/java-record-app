package com.java.spring.fleetapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.spring.fleetapp.model.Location;
import com.java.spring.fleetapp.repository.LocationRepository;

@Service
public class LocationService {
	
	@Autowired
	LocationRepository locationRepo;
	
	public List<Location> getAllLocations(){
		return locationRepo.findAll();
	}
		
	public void saveLocation(Location l) {
		 locationRepo.save(l);
		}
	
	public Location getOneLocation(int id) {
	return	locationRepo.getOne(id);
	}
	
	public Location save(Location l) {
		return locationRepo.save(l);
		}
	
	public void delete(int id) {
		locationRepo.deleteById(id);
	}

}
