package com.java.spring.fleetapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.spring.fleetapp.model.VehicleMaintainance;


@Repository
public interface VechileMaintainanceRepository extends JpaRepository<VehicleMaintainance,Integer>{

}
