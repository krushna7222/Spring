package com.org;

public class Vehicle {

	private Engine engn;

	
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicle(Engine engn) {
		super();
		this.engn = engn;
	}

	public Engine getEngn() {
		return engn;
	}

	public void setEngn(Engine engn) {
		this.engn = engn;
	}

	@Override
	public String toString() {
		return "Vehicle [engn=" + engn + "]";
	}
	
	public void run() {
		engn.start();
		System.out.println("Vehicle is Running..........");
	}

}
