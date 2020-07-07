package com.java.spring.fleetapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.java.spring.fleetapp.model.InvoiceStatus;
import com.java.spring.fleetapp.service.InvoiceStatusService;

@Controller
public class InvoiceStatusController {
	
	@Autowired
	InvoiceStatusService invoiceStatus;
	
	@RequestMapping(value="/invoicestatus",method=RequestMethod.GET)
	public String giveInvoiceStatus(Model model) {
	List<InvoiceStatus> invoiceStatusList=invoiceStatus.getAllInvoiceStatuss();
	model.addAttribute("invoiceStatuslist",invoiceStatusList );
		
		return "invoicestatus";
	}
	
	@RequestMapping(value="/invoicestatus/insert",method=RequestMethod.POST)
	public String insertinvoiceStatus(InvoiceStatus vs) {
		
		InvoiceStatus status=invoiceStatus.save(vs);
		if(status!=null) {
			return "redirect:/invoicestatus";
		}else {
			return "error inserting!!!";
		}
	}
		
		@RequestMapping(value="/invoicestatus/update",method= {RequestMethod.POST,RequestMethod.PUT})
		public String updateStatus(InvoiceStatus vs) {
			
			InvoiceStatus status=invoiceStatus.save(vs);
			if(status!=null) {
				return "redirect:/invoicestatus";
			}else {
				return "error updating!!!";
			}
		}
	
		
		
		@RequestMapping(value="/invoicestatus/delete",method= {RequestMethod.POST,RequestMethod.DELETE})
		public String delete(int id) {
			invoiceStatus.delete(id);
			return "redirect:/invoicestatus";
		}

}
