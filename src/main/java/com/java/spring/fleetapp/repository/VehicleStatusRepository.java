package com.java.spring.fleetapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.spring.fleetapp.model.VechileStatus;


@Repository
public interface VehicleStatusRepository extends JpaRepository<VechileStatus,Integer>{

}
