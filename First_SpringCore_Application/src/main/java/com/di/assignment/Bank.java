package com.di.assignment;

import org.springframework.beans.factory.annotation.Autowired;

public class Bank {
	
	@Autowired
//	@Qualifier("c1")
	private Customer cust;

	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bank(Customer cust) {
		super();
		this.cust = cust;
	}

	public Customer getCust() {
		return cust;
	}

	public void setCust(Customer cust) {
		this.cust = cust;
	}

	@Override
	public String toString() {
		return "Bank [cust=" + cust + "]";
	}
	
}
