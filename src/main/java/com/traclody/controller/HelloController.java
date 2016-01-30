package com.traclody.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.traclody.model.Event;

@Controller
public class HelloController {	
	 
	@RequestMapping(value = "/greeting")
	public String sayHello(Model model) {
		model.addAttribute("greeting", "Hello World");		
		return "hello";
	}
	@RequestMapping(value="/index")
	public String index(Model model){		 
		return "forward:index.jsp";		
	}
}
