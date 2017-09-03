package com.smrafael.virtusappws.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.smrafael.virtusappws.models.Curriculum;

@RestController
public class CurriculumController {
	
	@RequestMapping(path="/curriculum", method=RequestMethod.POST)
	public void create(@RequestBody Curriculum curriculum) {
		System.out.println(curriculum);
	}

}
