package com.java.spring.fleetapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.spring.fleetapp.model.VechileStatus;
import com.java.spring.fleetapp.repository.VehicleStatusRepository;

@Service
public class VehicleStatusService {

	@Autowired
	VehicleStatusRepository vechileStatusRepo;
	
	public List<VechileStatus> getAllVechileStatus(){
		return vechileStatusRepo.findAll();
	}
		
	public void saveVechileStatus(VechileStatus vs) {
		 vechileStatusRepo.save(vs);
		}
	
	public VechileStatus getOneVechileStatus(int id) {
	return	vechileStatusRepo.getOne(id);
	}
	
	public VechileStatus save(VechileStatus vs) {
		return vechileStatusRepo.save(vs);
		}
	
	public void delete(int id) {
		vechileStatusRepo.deleteById(id);
	}
	
}
