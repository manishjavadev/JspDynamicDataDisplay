package com.manish.javadev.model;

public class Address {
	private String city;
	private String area;

	public Address() {
		super();
	}

	public Address(String city, String area) {
		super();
		this.city = city;
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

}
