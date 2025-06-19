package com.javaBasedConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class JavaBasedConfig_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(JavaBasedConfiguration.class);
		
		Student1 s1 = (Student1)context.getBean("getStudent");
		
		System.out.println(s1);
	}

}
