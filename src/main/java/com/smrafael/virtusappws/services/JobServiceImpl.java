package com.smrafael.virtusappws.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.smrafael.virtusappws.models.Job;

@Service
public class JobServiceImpl implements JobService {
	
	private Job[] jobs = {new Job("Job 1", "Job description 1", "req1; req2; req3"), 
			new Job("Job 2", "Job description 2", "req1; req2; req3"), 
			new Job("Job 3", "Job description 3", "req1; req2; req3"),
			new Job("Job 4", "Job description 4", "req1; req2; req3")};

	@Override
	public List<Job> getAll() {
		return Arrays.asList(this.jobs);
	}
	
}