package com.manish.javadev.model;

import java.util.List;

public class Student {
	private String firstName;
	private String lastName;
	private List<String> address;

	public Student() {
		super();
	}

	public Student(String firstName, String lastName, List<String> address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	
}
