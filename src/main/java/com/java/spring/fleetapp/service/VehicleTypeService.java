package com.java.spring.fleetapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.spring.fleetapp.model.VehicleType;
import com.java.spring.fleetapp.repository.VechileTypeRepository;

@Service
public class VehicleTypeService {

	@Autowired
	VechileTypeRepository vehicleTypeRepo;
	
	public List<VehicleType> getAllVehicleTypes(){
		return vehicleTypeRepo.findAll();
	}
		
	public void saveVehicleType(VehicleType vt) {
		 vehicleTypeRepo.save(vt);
		}
	
	public VehicleType getOneVehicleType(int id) {
	return	vehicleTypeRepo.getOne(id);
	}
	
	public VehicleType save(VehicleType vt) {
		return vehicleTypeRepo.save(vt);
		}
	
	public void delete(int id) {
		vehicleTypeRepo.deleteById(id);
	}
}
