package com.smrafael.virtusappws.models;

public class Curriculum {

	private String name;
	private String area;
	private String phone;
	private String email;
	private String experience;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	
	@Override
	public String toString() {
		return "Curriculum [name=" + name + ", area=" + area + ", phone=" + phone + ", email=" + email + ", experience="
				+ experience + "]";
	}
	
}
