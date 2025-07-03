package com.demo.JDBCTemplateDemo;

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
  
//        Employee e1= new Employee();
//               e1.setId(1);
//               e1.setName("pooja");
//               e1.setSalary(2004.f);
//               
//                 EmpDao dao=  (EmpDao) context.getBean("dao");
//                 
//                 int res=  dao.saveEmp(e1);
//                 
//                     if(res>0)
//                     {
//                    	 System.out.println("data save successfully");
//                     }else
//                     {
//                    	 System.out.println("something went wrong");
//                     }
        
        
        
        
        
        
        
        
        
        
          //using preparec satemnet
        
        Employee e1= new Employee();
        e1.setId(1);
        e1.setName("pooja");
        e1.setSalary(2004.f);
        
          EmpDao dao=  (EmpDao) context.getBean("dao");
          
          boolean res=  dao.saveEmp(e1);
          System.out.println("Data Inserted");
             
        
        
        
        
        
        
        
    
    
    }
}
