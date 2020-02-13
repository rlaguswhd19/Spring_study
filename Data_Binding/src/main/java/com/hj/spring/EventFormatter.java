package com.hj.spring;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

@Component
public class EventFormatter implements Formatter<Event>{

	@Override
	public String print(Event object, Locale locale) {
		return ""+object.getId();
	}

	@Override
	public Event parse(String text, Locale locale) throws ParseException {
		return new Event(Integer.parseInt(text));
	}

}
