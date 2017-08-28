package com.smrafael.virtusappws.models;

public class Job {
	
	private String title;
	private String description;
	private String requirements;
	
	public Job(String title, String description, String requirements) {
		this.title = title;
		this.description = description;
		this.requirements = requirements;
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
	public String getRequirements() {
		return requirements;
	}
	public void setRequirements(String requirements) {
		this.requirements = requirements;
	}
	
}
