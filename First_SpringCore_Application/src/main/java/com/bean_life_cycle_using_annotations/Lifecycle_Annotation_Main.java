package com.bean_life_cycle_using_annotations;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lifecycle_Annotation_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("com//bean_life_cycle_using_annotations//lifecycle_annotation_config.xml");
		
	     Laptop1 p =(Laptop1)context.getBean("lp1");
         System.out.println(p);
         
		context.registerShutdownHook();

	}

}
