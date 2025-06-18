package com.bean_life_cycle_using_annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Laptop1 {
	
	private int id;
	private String name;
	private double price;
	
	
	int a=9,b=3;
	
	@PostConstruct
    public void init() //start(), hey()
    {
         System.out.println("at a time of bean initialization: add= "+(a+b));
    }
    
    @PreDestroy
    public void destroy() //end(), bye()
    {
         System.out.println("at a time of bean destroyation: sub= "+(a-b));
    }
    

}
