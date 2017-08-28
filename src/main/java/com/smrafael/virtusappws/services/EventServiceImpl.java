package com.smrafael.virtusappws.services;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.smrafael.virtusappws.models.Event;

@Service
public class EventServiceImpl implements EventService {

	@Override
	public List<Event> getAll() {
		List<Event> events =  new ArrayList<>();
		LocalDate localDate = LocalDate.now();
		
		localDate.plusDays(1);
		Event event1 = new Event("Event 1", "Event description 1", Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant()));
		
		localDate.minusDays(1);
		Event event2 = new Event("Event 2", "Event description 2", Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant()));
		
		localDate.minusDays(1);
		Event event3 = new Event("Event 3", "Event description 3", Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant()));
		
		events.add(event1);
		events.add(event2);
		events.add(event3);
		return events;
	}

}
