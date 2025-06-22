package com.di.javaBasedConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaBasedConfiguration.class);
		
		Student15 s1 = (Student15)context.getBean("getStudent15");
		
		System.out.println(s1);

	}

}
