package com.di.javaBasedConfiguration;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student15 {
	
	private int id;
	private String name;
	private Book bk;
	
	
	@Override
	public String toString() {
		String s = bk.reading();
		return "Student15 [id=" + id + ", name=" + name + ", bk=" + s + "]";
	}
	
	
}
