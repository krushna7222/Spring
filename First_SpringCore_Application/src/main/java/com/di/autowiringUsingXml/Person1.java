package com.di.autowiringUsingXml;

public class Person1 {
	
	private Address1 add;
	
	public Person1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person1(Address1 add) {
		super();
		this.add = add;
		System.out.println("in parameterised Constructor....");
	}

	public Address1 getAdd() {
		System.out.println("in setter....");
		return add;
	}

	public void setAdd(Address1 add) {
		System.out.println("in setter....");
		this.add = add;
	}

	@Override
	public String toString() {
		return "Person1 [add=" + add + "]";
	}

}
