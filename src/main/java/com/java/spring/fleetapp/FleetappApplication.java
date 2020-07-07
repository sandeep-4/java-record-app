package com.java.spring.fleetapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class FleetappApplication {

	
	@Bean
	public AuditorAware auditorAware(){
		return new AuditorAware();
	}
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(FleetappApplication.class, args);
	}

}
