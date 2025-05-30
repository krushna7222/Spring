package com.di.autowiringUsingXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.di.reference_injection.Person;

public class Autowiring_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com//di//autowiringUsingXml//autowiring_byName_config.xml");
		
		Person1 p = (Person1)context.getBean("p1");
		System.out.println(p);


	}

}
