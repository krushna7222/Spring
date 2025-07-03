package com.demo.CIMap;

public class Department {
	
	  int id;
	  String dep_name;
	public Department(int id, String dep_name) {
		super();
		this.id = id;
		this.dep_name = dep_name;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", dep_name=" + dep_name + "]";
	}
	  
	  
	    

}
