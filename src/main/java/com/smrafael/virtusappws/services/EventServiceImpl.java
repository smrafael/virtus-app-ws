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
		Event event1 = new Event("Super evento com imagem", "orem ipsum dolor sit amet, consectetur adipiscing elit. "
				+ "Quisque tristique enim lobortis neque semper suscipit. Mauris non ipsum eu massa ultrices dictum et sit amet est. "
				+ "Fusce hendrerit lacinia metus vel scelerisque.", Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant()),
				"https://icon-icons.com/icons2/906/PNG/512/computing-code_icon-icons.com_70226.png");
		
		localDate = localDate.minusDays(1);
		Event event2 = new Event("Super evento sem imagem", "orem ipsum dolor sit amet, consectetur adipiscing elit. "
				+ "Quisque tristique enim lobortis neque semper suscipit. Mauris non ipsum eu massa ultrices dictum et sit amet est. "
				+ "Fusce hendrerit lacinia metus vel scelerisque.", Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant()),
				null);
		
		localDate = localDate.minusDays(1);
		Event event3 = new Event("Outro evento", "orem ipsum dolor sit amet, consectetur adipiscing elit. "
				+ "Quisque tristique enim lobortis neque semper suscipit. Mauris non ipsum eu massa ultrices dictum et sit amet est. "
				+ "Fusce hendrerit lacinia metus vel scelerisque.", Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant()),
				"https://www.globalweb.com.br/wp-content/uploads/2013/09/cloud.png");
		
		events.add(event1);
		events.add(event2);
		events.add(event3);
		return events;
	}

}
