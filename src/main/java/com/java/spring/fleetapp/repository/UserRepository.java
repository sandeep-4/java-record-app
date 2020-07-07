package com.java.spring.fleetapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.spring.fleetapp.model.User;


@Repository
public interface UserRepository extends JpaRepository<User,Integer>{

	
	public User findByUsername(String username);
	
//	public String findByUsername(String usernmae);
}
