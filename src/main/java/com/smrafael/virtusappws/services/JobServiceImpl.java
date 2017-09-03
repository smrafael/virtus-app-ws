package com.smrafael.virtusappws.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.smrafael.virtusappws.models.Job;

@Service
public class JobServiceImpl implements JobService {
	
	private Job[] jobs = {new Job("Desenvolvedor Java", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. "
				+ "Quisque tristique enim lobortis neque semper suscipit.", "Lorem ipsum dolor sit amet, consectetur adipiscing elit."), 
			new Job("Analista Java", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. "
					+ "Quisque tristique enim lobortis neque semper suscipit.", "Lorem ipsum dolor sit amet, consectetur adipiscing elit."), 
			new Job("Arquiteto", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. "
					+ "Quisque tristique enim lobortis neque semper suscipit.", "Lorem ipsum dolor sit amet, consectetur adipiscing elit."),
			new Job("Testador", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. "
					+ "Quisque tristique enim lobortis neque semper suscipit.", "Lorem ipsum dolor sit amet, consectetur adipiscing elit.")};

	@Override
	public List<Job> getAll() {
		return Arrays.asList(this.jobs);
	}
	
}