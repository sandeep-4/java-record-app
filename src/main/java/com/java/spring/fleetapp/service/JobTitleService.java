package com.java.spring.fleetapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.spring.fleetapp.model.JobTitle;
import com.java.spring.fleetapp.repository.JobTitleRepository;

@Service
public class JobTitleService {

	@Autowired
	JobTitleRepository jobTitleRepo;
	
	public List<JobTitle> getAllJobTitles(){
		return jobTitleRepo.findAll();
	}
		
	public void saveJobTitle(JobTitle jt) {
		 jobTitleRepo.save(jt);
		}
	
	public JobTitle getOneJobTitle(int id) {
	return	jobTitleRepo.getOne(id);
	}
	
	public JobTitle save(JobTitle jt) {
		return jobTitleRepo.save(jt);
		}
	
	public void delete(int id) {
		jobTitleRepo.deleteById(id);
	}
}
