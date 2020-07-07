package com.java.spring.fleetapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleMovementController {
	@GetMapping("/vechilemovement")
	public String giveVechileMovement() {
		return "vechileMovement";
	}
}
