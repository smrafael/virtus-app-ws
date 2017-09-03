package com.smrafael.virtusappws.models;

import java.util.Date;

public class Event {
	
	private String title;
	private String description;
	private Date date;
	private String imageUrl;
	
	public Event(String title, String description, Date date, String imageUrl) {
		this.title = title;
		this.description = description;
		this.date = date;
		this.imageUrl = imageUrl;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
}