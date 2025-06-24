package com.di.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println();
		System.out.println("Using autowire attribute");
		System.out.println();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com//di//assignment//bank_xml.xml");

		Bank b1 = (Bank) context.getBean("b1");

		System.out.println(b1);
		
		
		System.out.println();
		System.out.println("Using Autowire Annotation");
		System.out.println();
		
		ApplicationContext context1 = new ClassPathXmlApplicationContext("com//di//assignment//bank_annot.xml");

		Bank b2 = (Bank) context1.getBean("b2");
		
		System.out.println(b2);

	}

}
