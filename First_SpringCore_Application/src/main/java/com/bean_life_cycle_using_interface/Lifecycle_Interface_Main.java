package com.bean_life_cycle_using_interface;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lifecycle_Interface_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("com//bean_life_cycle_using_interface/lifecycle_interface_config.xml");
		
		Laptop2 lp = (Laptop2)context.getBean("lp2");
		
		System.out.println(lp);
		
		context.registerShutdownHook();
	}

}
