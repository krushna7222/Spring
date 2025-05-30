package com.di.property_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Property_Injection_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com//di//property_injection//prop_config.xml");
		
		Student student1  =(Student)context.getBean("s1");
		System.out.println(student1);
		
		Student student2  =(Student)context.getBean("s2");
		System.out.println(student2);

	}

}
