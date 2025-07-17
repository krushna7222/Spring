package com.demo.CIWithDependantObj;

public class Address {
	
	
	   private String city,State;

	public Address(String city, String state) {
		super();
		this.city = city;
		State = state;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", State=" + State + "]";
	}
	   
	   
	      

}
