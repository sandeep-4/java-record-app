package com.java.spring.fleetapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.spring.fleetapp.model.User;
import com.java.spring.fleetapp.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepo;
	
	
	public User save(User user) {
		return userRepo.save(user);
	}
}
