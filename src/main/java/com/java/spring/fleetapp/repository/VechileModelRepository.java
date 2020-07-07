package com.java.spring.fleetapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.spring.fleetapp.model.VehicleModel;


@Repository
public interface VechileModelRepository extends JpaRepository<VehicleModel,Integer>{

}
