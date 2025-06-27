package com.demo.SecounProject;

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
    	  
        ApplicationContext  c1 =new  ClassPathXmlApplicationContext("config.xml");
        
        
        Employee e1= (Employee) c1.getBean("emp");
        Employee e2= (Employee) c1.getBean("emp1");
        
        System.out.println(e1);
          System.out.println(e2);
        
    }
}
