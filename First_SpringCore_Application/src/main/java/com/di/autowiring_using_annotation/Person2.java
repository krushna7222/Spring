package com.di.autowiring_using_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Person2 {

	@Autowired // it neither uses setter injection nor uses constructor injection => menas it
				// is not uses autowirig by name, nor ny by type nor by constructor
	@Qualifier("add89")
	private Address2 add;

	public Address2 getAdd() {
		return add;
	}

	// @Autowired //it uses setter injection => means it uses autowirig byType(if
	// bean name is different as property name) or byName(if bean name is same as
	// property name)
	public void setAdd(Address2 add) {
		this.add = add;
		System.out.println("in address setter...");
	}

	// @Autowired //it uses constructor injection => means it uses autowirig by
	// constructor
	public Person2(Address2 add) {
		super();
		this.add = add;
		System.out.println("in parameterized constrcutor...");
	}

	public Person2() {
		super();
		System.out.println("in default cons..");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Person2 [add=" + add + "]";
	}

}
