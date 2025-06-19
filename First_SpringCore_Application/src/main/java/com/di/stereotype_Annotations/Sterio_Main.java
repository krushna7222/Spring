package com.di.stereotype_Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Sterio_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com//di//stereotype_Annotations//sterio_config.xml");

		Product p = (Product)context.getBean("product");
		
		p.setId(201);
		p.setName("Watch");
		p.setPrice(36510.21);
		
		
		
		System.out.println(p);
		
	}

}
