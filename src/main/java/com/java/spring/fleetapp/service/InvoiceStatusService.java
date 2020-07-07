package com.java.spring.fleetapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.spring.fleetapp.model.InvoiceStatus;
import com.java.spring.fleetapp.repository.InvoiceStatusRepository;

@Service
public class InvoiceStatusService {

	@Autowired
	InvoiceStatusRepository invoiceStatusRepo;
	
	public List<InvoiceStatus> getAllInvoiceStatuss(){
		return invoiceStatusRepo.findAll();
	}
		
	public void saveInvoiceStatus(InvoiceStatus is) {
		 invoiceStatusRepo.save(is);
		}
	
	public InvoiceStatus getOneInvoiceStatus(int id) {
	return	invoiceStatusRepo.getOne(id);
	}
	
	public InvoiceStatus save(InvoiceStatus is) {
		return invoiceStatusRepo.save(is);
		}
	
	public void delete(int id) {
		invoiceStatusRepo.deleteById(id);
	}
	
	
}
