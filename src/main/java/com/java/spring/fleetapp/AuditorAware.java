package com.java.spring.fleetapp;

import java.util.Optional;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public class AuditorAware implements org.springframework.data.domain.AuditorAware<String>{

	@Override
	public Optional<String> getCurrentAuditor() {
		
		Authentication aun=SecurityContextHolder.getContext().getAuthentication();
		String username=aun.getName();
		
		return Optional.ofNullable(username).filter(s -> !s.isEmpty());
	}

}
