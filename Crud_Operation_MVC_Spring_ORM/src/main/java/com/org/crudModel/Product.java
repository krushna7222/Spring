package com.org.crudModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
Q. what  is the difference between java jdbc and hibernate?
   1. in hibernate we don't have to write queries....becoz  hibernate will write queries for each crud operation
  2. in hibernate we don't have to  create table becoz  hibernate will create table for each class which annotated with @Entity annotation

  3. in hibernate, we don't have to handle an exception manually by using throws or trycacth bcz, hibernate internally handles an exception

4.  in hibernate, we don't have to repeat the connection code again and again.. which just need put that connection code/ database connectivity stepsin  "hibernate.cfg.xml" file and this file automatically accessible throughout the  appl

hibernate.cfg.xml => database connectivity steps

*/

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String name;
	
	private String description;
	private double price;

}
