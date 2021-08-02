package com.yograj.ec.training.Assginment1;

import java.io.FileReader;

public class Student {
	
	private String id;
	private String firstname;
	private String lastname;
	private String dob;
	private String Contact;
	private String Email;
	
	//FileReader reader = new FileReader(".\\jsonfile\\studentAndCourseJSON.json");
	
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public String getContact() {
		return Contact;
	}


	public void setContact(String contact) {
		Contact = contact;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public String get(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
}