package com.demo.SIDemo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext c1 = new ClassPathXmlApplicationContext("config.xml");
          
         Employee e= (Employee) c1.getBean("emp1");
         
         System.out.println(e);
         
         System.out.println("*********designation*********");
         
         for(String s1 : e.getDesignation())
         {
        	   System.out.println(s1);
         }           
    }
}
