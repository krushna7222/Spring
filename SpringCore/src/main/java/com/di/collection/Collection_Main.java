package com.di.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Collection_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com//di//collection//collection_config.xml");
		
		Emp e1 = (Emp)context.getBean("emp1");
		System.out.println(e1);
		System.out.println();
		System.out.println(e1.getId());
		System.out.println(e1.getName());
		System.out.println(e1.getPhones());
		System.out.println(e1.getAddresses());
		System.out.println(e1.getCourses());
		System.out.println(e1.getProps());
	}

}
