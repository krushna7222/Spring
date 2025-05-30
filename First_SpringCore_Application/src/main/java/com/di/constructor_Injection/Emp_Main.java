package com.di.constructor_Injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Emp_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com//di//constructor_Injection//book_config.xml");
		
		Emp e1 = (Emp)context.getBean("e1");
		System.out.println(e1);
		
		Emp e2 = (Emp)context.getBean("e2");
		System.out.println(e2);
		
		Emp e3 = (Emp)context.getBean("e3");
		System.out.println(e3);

	}

}
