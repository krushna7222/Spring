package com.demo.JDBCTemplateDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DeleteEMp {

	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		  
	        Employee e1= new Employee();
	               e1.setId(1);
	               e1.setName("subhash");
	               e1.setSalary(4004.f);
	               
	                 EmpDao dao=  (EmpDao) context.getBean("dao");
	                 
	                 int res=  dao.deletEmp(e1);
	                 
	                     if(res>0)
	                     {
	                    	 System.out.println("data delted successfully");
	                     }else
	                     {
	                    	 System.out.println("something went wrong");
	                     }
	    

	}

}
