package com.di.reference_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Reference_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com//di//reference_injection//ref_config.xml");
		
		
		Student s1 = (Student) context.getBean("stud");
		System.out.println(s1);
		
		System.out.println();
		System.out.println(s1.getId());
		System.out.println(s1.getName());
		System.out.println(s1.getPhone());
		System.out.println(s1.getAdd());
		System.out.println(s1.getAdd().getCity());
		System.out.println(s1.getAdd().getDist());
		System.out.println(s1.getAdd().getState());
		System.out.println(s1.getAdd().getPinCode());
		
		System.out.println();
		
		Student s2 = (Student) context.getBean("stud2");
		System.out.println(s2);
		
		System.out.println();
		System.out.println(s2.getId());
		System.out.println(s2.getName());
		System.out.println(s2.getPhone());
		System.out.println(s2.getAdd());
		System.out.println(s2.getAdd().getCity());
		System.out.println(s2.getAdd().getDist());
		System.out.println(s2.getAdd().getState());
		System.out.println(s2.getAdd().getPinCode());
	}

}
