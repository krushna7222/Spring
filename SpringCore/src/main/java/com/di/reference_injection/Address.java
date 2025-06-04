package com.di.reference_injection;

public class Address {
	
	private String city;
	private String dist;
	private String state;
	private int pinCode;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String city, String dist, String state, int pinCode) {
		super();
		this.city = city;
		this.dist = dist;
		this.state = state;
		this.pinCode = pinCode;
	}

	public String getCity() {
		return city;
	}

	public String getDist() {
		return dist;
	}

	public String getState() {
		return state;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setDist(String dist) {
		this.dist = dist;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", dist=" + dist + ", state=" + state + ", pinCode=" + pinCode + "]";
	}	

}
