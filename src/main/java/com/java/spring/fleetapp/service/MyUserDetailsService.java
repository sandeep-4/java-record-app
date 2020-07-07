package com.java.spring.fleetapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.java.spring.fleetapp.model.User;
import com.java.spring.fleetapp.model.UserPrincipal;
import com.java.spring.fleetapp.repository.UserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService{

	
	
	@Autowired
	UserRepository userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	User user=	userRepo.findByUsername(username);
	if(user==null) {
		throw new UsernameNotFoundException("user not found !!!");
	}
	return new UserPrincipal(user);
	}

}
