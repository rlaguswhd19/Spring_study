package com.hj.spring;

public class Event {
	
	private int id;
	private String title;
	
	public Event(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return "Event [id=" + id + ", title=" + title + "]";
	}
}
