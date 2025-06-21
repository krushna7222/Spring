package com.di.P_Schema_Injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Book_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com//di//P_Schema_Injection//Book_config.xml");
		
		Book b1 = (Book)context.getBean("b1");
		System.out.println(b1);
		
		Book b2 = (Book)context.getBean("b2");
		System.out.println(b2);

	}

}
