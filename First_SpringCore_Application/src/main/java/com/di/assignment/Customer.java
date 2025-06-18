package com.di.assignment;

public class Customer {

	private int customerAccountNumber;
	private String customerName;
	private String phone;
	private String address;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int customerAccountNumber, String customerName, String phone, String address) {
		super();
		this.customerAccountNumber = customerAccountNumber;
		this.customerName = customerName;
		this.phone = phone;
		this.address = address;
	}

	public int getCustomerAccountNumber() {
		return customerAccountNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}

	public void setCustomerAccountNumber(int customerAccountNumber) {
		this.customerAccountNumber = customerAccountNumber;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [customerAccountNumber=" + customerAccountNumber + ", customerName=" + customerName
				+ ", phone=" + phone + ", address=" + address + "]";
	}
	
}
