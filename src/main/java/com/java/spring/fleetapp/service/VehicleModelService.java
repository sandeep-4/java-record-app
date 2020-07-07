package com.java.spring.fleetapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.spring.fleetapp.model.VehicleModel;
import com.java.spring.fleetapp.repository.VechileModelRepository;

@Service
public class VehicleModelService {

	@Autowired
	VechileModelRepository vechileModelRepo;
	
	public List<VehicleModel> getAllVechileModels(){
		return vechileModelRepo.findAll();
	}
		
	public void saveVechileModel(VehicleModel vm) {
		 vechileModelRepo.save(vm);
		}
	
	public VehicleModel getOneVechileModel(int id) {
	return	vechileModelRepo.getOne(id);
	}
	
	public VehicleModel save(VehicleModel vm) {
		return vechileModelRepo.save(vm);
		}
	
	public void delete(int id) {
		vechileModelRepo.deleteById(id);
	}
}
