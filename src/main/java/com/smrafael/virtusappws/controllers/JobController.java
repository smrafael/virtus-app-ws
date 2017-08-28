package com.smrafael.virtusappws.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smrafael.virtusappws.models.Job;
import com.smrafael.virtusappws.services.JobService;

@RestController
public class JobController {
	
	@Autowired
	private JobService jobService;
	
	@RequestMapping("/jobs")
	public List<Job> getAll() {
		return jobService.getAll();
	}
	
}
