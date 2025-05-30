package com.di.injectingPrimitiveValues;


//Program for dependency injection primitive values into bean using setter injection

public class Student {

	private int rollno;
	private String name;
	private double marks;
	
	
	
	public Student() {
		
		super();
		System.out.println("In Default Constructor...");
		
	}


	public Student(int rollno, String name, double marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
		System.out.println("In Parameterised Constructor...");

	}


	public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
		System.out.println("In roll No Setters...");

	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
		System.out.println("In name Setters...");

	}


	public double getMarks() {
		return marks;
	}


	public void setMarks(double marks) {
		this.marks = marks;
		System.out.println("In marks Setters...");

	}


	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}

}
