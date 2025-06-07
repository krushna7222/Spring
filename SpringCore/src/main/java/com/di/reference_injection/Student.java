package com.di.reference_injection;

public class Student {
	
	private int id;
	private String name;
	private long phone;
	private Address add;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, long phone, Address add) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.add = add;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public long getPhone() {
		return phone;
	}

	public Address getAdd() {
		return add;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", phone=" + phone + ", add=" + add + "]";
	}

}
