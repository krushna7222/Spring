package com.bean_life_cycle_using_cutom_method;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Laptop {

	private int id;
	private String name;
	private double price;
	
	int a=10,b=15;
	
    public void init() //start(), hey()
    {
         System.out.println("at a time of bean initialization: add= "+(a+b));
    }
    
    
    public void destroy() //end(), bye()
    {
         System.out.println("at a time of bean destroyation: sub= "+(a-b));
    }
    
	
}
