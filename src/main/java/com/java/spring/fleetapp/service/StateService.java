package com.java.spring.fleetapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.spring.fleetapp.model.States;
import com.java.spring.fleetapp.repository.StateRepository;

@Service
public class StateService {

	@Autowired
	StateRepository stateRepo;
	
	
	public States saveStates(States state) {
		return stateRepo.save(state);
	}
	
	public void saveState(States state) {
		stateRepo.save(state);
	}
	
	public List<States> allStates(){
		return stateRepo.findAll();
	}
	
	public States getOne(int id) {
		return stateRepo.getOne(id);
	}
	
	public void delete(int id) {
		stateRepo.deleteById(id);
	}
}
