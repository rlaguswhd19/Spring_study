package com.hj.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {
	
	@GetMapping("/events/{event}")
	public String getEvent(@PathVariable Event event) {
		System.out.println(event);
		return ""+event.getId();
	}
}
