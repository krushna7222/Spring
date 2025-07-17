package com.demo.CIWithDependantObj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	ApplicationContext context=  new ClassPathXmlApplicationContext("config.xml");
    	
    	       Employee e= (Employee)context.getBean("emp1");
    	       System.out.println(e);
    	       Employee e2= (Employee)context.getBean("emp2");
    	       System.out.println(e2);
    	       Employee e3= (Employee)context.getBean("emp3");
    	       System.out.println(e3);
    	       
    	       
    	       e3.disp();
    	       
    	       
    	       
    	       
    	       
    }
}
