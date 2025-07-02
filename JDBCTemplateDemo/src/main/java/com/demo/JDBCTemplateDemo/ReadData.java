package com.demo.JDBCTemplateDemo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReadData {

	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		   EmpDao dao=  (EmpDao) context.getBean("dao");
		   
		         List<Employee>  e= dao.getAllEMp();
		         
		            for(Employee e1:  e)
		            {
		            	System.out.println(e1.getId()+"  "+e1.getName()+" "+e1.getSalary());
		            }
	}

}
