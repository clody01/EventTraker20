package com.traclody.controller;

import java.util.LinkedList; 

 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.traclody.model.Event;

@RestController
public class EventsReportController {
	
	@RequestMapping(value="/events")
	public LinkedList<Event> getEvent(){		 
		LinkedList<Event> events = new LinkedList<>();
		Event event1 = new Event();
		event1.setNom("Tra");
		event1.setPrenom("Tra");
		Event event2 = new Event();
		event2.setNom("Traore");
		event2.setPrenom("Traore");
		Event event3 = new Event();
		event3.setNom("Tranan");
		event3.setPrenom("Tranan");
		Event event4 = new Event();
		event4.setNom("Tralou");
		event4.setPrenom("Tralou");
		events.add(event1);
		events.add(event2);
		events.add(event3);
		events.add(event4);
		return events;
	}

}
