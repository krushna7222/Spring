package com.demo.FirstProject;

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
        
        
        ApplicationContext  c1 =new  ClassPathXmlApplicationContext("config.xml");
        
        
        Employee e1= (Employee) c1.getBean("emp");
        
          System.out.println(e1.getId()+"  "+e1.getName()+"  "+e1.getSalary());
   
        
    }
}
