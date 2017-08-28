package com.smrafael.virtusappws.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smrafael.virtusappws.models.Event;
import com.smrafael.virtusappws.services.EventService;

@RestController
public class EventController {
	
	@Autowired
	private EventService eventService;
	
	@RequestMapping("/events")
	public List<Event> getAll() {
		return eventService.getAll();
	}
	
}
