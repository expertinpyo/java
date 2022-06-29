package com.ObjectOrientedProgramming;

public class Address {
	private String line1;
	private String city;
	private String zipcode;

	public Address(String line1, String city, String zipcode) {
		super();
		this.line1 = line1;
		this.city = city;
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "Address [line1=" + line1 + ", city=" + city + ", zipcode=" + zipcode + "]";
	}

}
