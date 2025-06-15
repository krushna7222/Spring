package com.javaBasedConfiguration;

/*
@Configuration
the class which is annotated with @Configuration  annotation can consist of bean configuration(just like .xml configuration file).

@Bean 
It is a method level annotation Indicates that a method generates a bean to be managed by the Spring container.
*/

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaBasedConfiguration {

	@Bean
	public Student1 getStudent() {
		
		Student1 s1 = new Student1();
		s1.setId(101);
		s1.setName("Rajesh");
		s1.setAddress("Pune");
		
		return s1;
	}
}
