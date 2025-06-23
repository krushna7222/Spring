package com.di.autowiringUsingXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Autowiring_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//AutoWire By Name
		
		System.out.println();
		System.out.println("\nAutowiring by Name\n");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com//di//autowiringUsingXml//autowiring_byName_config.xml");
		
		Person1 p = (Person1)context.getBean("p1");
		System.out.println(p);
		
		
		//AutoWire By Type
		
		System.out.println();
		System.out.println("\nAutowiring by Type\n");

		
		ApplicationContext context1 = new ClassPathXmlApplicationContext("com//di//autowiringUsingXml//autowiring_byType_config.xml");
		
		Person1 p2 = (Person1)context1.getBean("p2");
		System.out.println(p2);
		
		System.out.println();
		System.out.println("\nAutowiring Constructor\n");
		
		ApplicationContext context3 = new ClassPathXmlApplicationContext("com//di//autowiringUsingXml//autowiring_constructor_config.xml");
		
		Person1 p3 = (Person1)context3.getBean("p3");
		System.out.println(p3);


	}

}
