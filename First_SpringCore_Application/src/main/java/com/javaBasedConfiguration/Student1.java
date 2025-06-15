package com.javaBasedConfiguration;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@NoArgsConstructor
public class Student1 {
	
	private int id;
	private String name;
	private String address;
}
