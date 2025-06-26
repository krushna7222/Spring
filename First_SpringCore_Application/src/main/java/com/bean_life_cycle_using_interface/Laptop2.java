package com.bean_life_cycle_using_interface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Laptop2  implements InitializingBean, DisposableBean
{
	
	private int id;
	private String name;
	private double price;
	
	int a=6,b=3;
	

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
        System.out.println("at a time of bean initialization: add= "+(a+b));
	}
	
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
        System.out.println("at a time of bean destroyation: sub= "+(a-b));
	}

}
