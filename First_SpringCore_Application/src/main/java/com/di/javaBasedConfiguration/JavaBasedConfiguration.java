package com.di.javaBasedConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaBasedConfiguration {
	
	@Bean
	public Book getbook() {
		Book bk = new Book();
		return bk;
	}
	
	@Bean
	public Student15 getStudent15() {
		Student15 s1 = new Student15(101,"Sachin",getbook());
		return s1;
	}

}
