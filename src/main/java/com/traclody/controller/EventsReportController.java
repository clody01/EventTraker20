package com.traclody.controller;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.traclody.model.Event;

@RestController
public class EventsReportController {
	
	@RequestMapping(value="/events")
	public List<Event> getEvent(){	
		//les arraylistes peuvent etre transmisent avec REST
		List<Event> events = new ArrayList<>();
		Event event1 = new Event();
		event1.setNom("Tra");
		event1.setPrenom("clody");
		Event event2 = new Event();
		event2.setNom("Traore");
		event2.setPrenom("adama");
		Event event3 = new Event();
		event3.setNom("Tranan");
		event3.setPrenom("pauline");
		Event event4 = new Event();
		event4.setNom("Tralou");
		event4.setPrenom("Jacqueline");
		events.add(event1);
		events.add(event2);
		events.add(event3);
		events.add(event4);
		return events;
	}

}
