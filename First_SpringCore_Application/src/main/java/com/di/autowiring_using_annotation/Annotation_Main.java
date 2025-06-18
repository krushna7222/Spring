package com.di.autowiring_using_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Annotation_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com//di//autowiring_using_annotation//auto_annotation_config.xml");

		
		Person2 p1 =(Person2)context.getBean("p1");
		
		System.out.println(p1);
		
	}

}
