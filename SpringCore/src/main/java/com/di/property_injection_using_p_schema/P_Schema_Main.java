package com.di.property_injection_using_p_schema;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class P_Schema_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/di//property_injection_using_p_schema//p_schema_config.xml");
		
		Employee e1 = (Employee)context.getBean("e1");
		System.out.println(e1);
		
		Employee e2 = (Employee)context.getBean("e2");
		System.out.println(e2);

	}

}
