package com.java.spring.fleetapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.spring.fleetapp.model.VechileMake;
import com.java.spring.fleetapp.repository.VechileMakeRepository;

@Service
public class VehicleMakeService {

	@Autowired
	VechileMakeRepository vehicleMakeRepo;
	
	public List<VechileMake> getAllVehicleMakes(){
		return vehicleMakeRepo.findAll();
	}
		
	public void saveVehicleMake(VechileMake vm) {
		 vehicleMakeRepo.save(vm);
		}
	
	public VechileMake getOneVehicleMake(int id) {
	return	vehicleMakeRepo.getOne(id);
	}
	
	public VechileMake save(VechileMake vm) {
		return vehicleMakeRepo.save(vm);
		}
	
	public void delete(int id) {
		vehicleMakeRepo.deleteById(id);
	}
}
