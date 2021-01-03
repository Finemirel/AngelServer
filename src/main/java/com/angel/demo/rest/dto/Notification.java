package com.angel.demo.rest.dto;

public class Notification {
	
	private static Long idGenerator=1L;

	private Long id = idGenerator;
	private String name;
	private String text;
	
	public Notification(String name, String text) {
		super();
		this.name = name;
		this.text = text;
		idGenerator++;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	
	
	
	
}
