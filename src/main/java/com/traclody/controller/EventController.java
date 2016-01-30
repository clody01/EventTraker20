package com.traclody.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.traclody.model.Event;


@Controller
public class EventController {
	@RequestMapping(value="/event",method=RequestMethod.GET)
	public String displayEventPage(Model model){
		Event event = new Event();
		event.setNom("Traoré");
		event.setPrenom("Adama");
		model.addAttribute("event",event);
		return "event";		
	}

	
	@RequestMapping(value="/event",method=RequestMethod.POST)
	public String processEvent(@ModelAttribute("event") Event event){
		System.out.println(event.getNom() +" "+event.getPrenom());
		return "event";		
	}
}
