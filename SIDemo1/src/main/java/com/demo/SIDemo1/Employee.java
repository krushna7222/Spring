package com.demo.SIDemo1;

import java.util.List;

public class Employee {
	 
	private int id;
	private String  name;
	
	DOJ doj;
	
	List<String>  designation;
	
	
	public List<String> getDesignation() {
		return designation;
	}
	public void setDesignation(List<String> designation) {
		this.designation = designation;
	}
	public DOJ getDoj() {
		return doj;
	}
	public void setDoj(DOJ doj) {
		this.doj = doj;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", doj=" + doj + ", designation=" + designation + "]";
	}

	  

}
