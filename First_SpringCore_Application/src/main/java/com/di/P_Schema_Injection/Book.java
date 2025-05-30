package com.di.P_Schema_Injection;

//Pojo class =>the class consists of private properties  and setter getters for each properties called as POJO class 
//java bean class => the class consists of private properties ,setter getters, constructors, toString() called as Java bean class


public class Book {
	
	private String name;
	private String author;
	private double price;
	private int quantity;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Book(String name, String author, double price, int quantity) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}
	public double getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", price=" + price + ", quantity=" + quantity + "]";
	}

}
