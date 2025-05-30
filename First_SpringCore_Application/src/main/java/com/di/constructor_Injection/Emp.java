package com.di.constructor_Injection;

public class Emp {

	private int eid;
	private String ename;
	private double salary;
	private String address;
	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("In Default Constructor...");
	}

	public Emp(int eid, String ename, double salary, String address) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.address = address;
		System.out.println("In Parameterised Constructor...");
	}

	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", address=" + address + " ]";
	}
	
}

