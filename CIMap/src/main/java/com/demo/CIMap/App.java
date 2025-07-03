package com.demo.CIMap;

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
        System.out.println( "Hello World!" );
        
        ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
          Employee e= (Employee) context.getBean("emp1");
          System.out.println(e);
          Employee e2= (Employee) context.getBean("emp2");
          System.out.println(e2);
        
    }
}
