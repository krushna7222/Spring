package com.demo.JDBCTemplateDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UpdateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		  
	        Employee e1= new Employee();
	               e1.setId(1);
	               e1.setName("subhash");
	               e1.setSalary(4004.f);
	               
	                 EmpDao dao=  (EmpDao) context.getBean("dao");
	                 
	                 int res=  dao.update(e1);
	                 
	                     if(res>0)
	                     {
	                    	 System.out.println("data update successfully");
	                     }else
	                     {
	                    	 System.out.println("something went wrong");
	                     }
	    

	}

}
