package com.java.spring.fleetapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.spring.fleetapp.model.Client;
import com.java.spring.fleetapp.repository.ClientRepository;

@Service
public class ClientService {

	@Autowired
	ClientRepository clientRepo;
	
	public Client save(Client client) {
		return clientRepo.save(client);
	}
	
	public Client getOne(int id) {
		return clientRepo.getOne(id);
	}
	
	public List<Client> findAllClients() {
		return clientRepo.findAll();
		}
	
	public void delete(int id) {
		clientRepo.deleteById(id);
	}
}
