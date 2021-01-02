package com.angel.demo.rest.dto;

import java.util.Date;

public class News {

	private Long id;
	private String name;
	private String text;
	private Date date;
	
	public News(Long id, String name, String text, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.text = text;
		this.date = date;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
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
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
	
}
