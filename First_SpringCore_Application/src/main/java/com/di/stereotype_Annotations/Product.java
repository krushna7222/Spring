package com.di.stereotype_Annotations;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@NoArgsConstructor
public class Product {
	
//	@Value("101")
	private int id;
	
//	@Value("Mobile")
	private String name;
	
//	@Value("23443.20")
	private double price;
//	
//	public Product() {
//		super();
//		// TODO Auto-generated constructor stub
//		System.out.println("In Default Constructor...");
//	}
//
//	public Product(int id, String name, double price) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.price = price;
//		System.out.println("In Parameterised Constructor...");
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public double getPrice() {
//		return price;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//		System.out.println("In ID Setter...");
//	}
//
//	public void setName(String name) {
//		this.name = name;
//		System.out.println("In name Setter...");
//	}
//
//	public void setPrice(double price) {
//		this.price = price;
//		System.out.println("In price Setter...");
//	}
//
//	@Override
//	public String toString() {
//		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
//	}

}
