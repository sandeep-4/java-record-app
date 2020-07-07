package com.java.spring.fleetapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.java.spring.fleetapp.model.JobTitle;
import com.java.spring.fleetapp.service.JobTitleService;

@Controller
public class JobTitleController {
	
	@Autowired
	JobTitleService jobTitle;
	
	@RequestMapping(value="/jobtitle",method=RequestMethod.GET)
	public String giveJobTitle(Model model) {
	List<JobTitle> jobTitleList=jobTitle.getAllJobTitles();
	model.addAttribute("jobTitlelist",jobTitleList );
		
		return "jobtitle";
	}
	
	@RequestMapping(value="/jobtitle/insert",method=RequestMethod.POST)
	public String insertjobTitle(JobTitle vs) {
		
		JobTitle status=jobTitle.save(vs);
		if(status!=null) {
			return "redirect:/jobtitle";
		}else {
			return "error inserting!!!";
		}
	}
		
		@RequestMapping(value="/jobtitle/update",method= {RequestMethod.POST,RequestMethod.PUT})
		public String updateStatus(JobTitle vs) {
			
			JobTitle status=jobTitle.save(vs);
			if(status!=null) {
				return "redirect:/jobtitle";
			}else {
				return "error updating!!!";
			}
		}
	
		
		
		@RequestMapping(value="/jobtitle/delete",method= {RequestMethod.POST,RequestMethod.DELETE})
		public String delete(int id) {
			jobTitle.delete(id);
			return "redirect:/jobtitle";
		}

	
	
	
	
	

}
