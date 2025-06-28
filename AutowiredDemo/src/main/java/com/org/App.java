package com.org;

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
        
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        Vehicle v1 = (Vehicle) context.getBean("v1");
        v1.run();
        
        System.out.println();
        
        Vehicle v2 = (Vehicle) context.getBean("v2");
        v2.run();
        
        System.out.println();
        
        Vehicle v3 = (Vehicle) context.getBean("v3");
        v3.run();	
    }
}
