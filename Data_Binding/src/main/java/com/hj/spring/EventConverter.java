package com.hj.spring;

import org.springframework.core.convert.converter.Converter;

public class EventConverter {
	public static class StringtoEventConverter implements Converter<String, Event> {

		@Override
		public Event convert(String source) {
			return new Event(Integer.parseInt(source));
		}
	}
	public static class EventtoStringConverter implements Converter<Event, String> {

		@Override
		public String convert(Event source) {
			return ""+source.getId();
		}
		
	}
	
}
