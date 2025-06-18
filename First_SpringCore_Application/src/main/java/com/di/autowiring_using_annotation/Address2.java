package com.di.autowiring_using_annotation;

public class Address2 {

	private String city;
	private int pincode;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public Address2(String city, int pincode) {
		super();
		this.city = city;
		this.pincode = pincode;
	}

	public Address2() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Address2 [city=" + city + ", pincode=" + pincode + "]";
	}
}
