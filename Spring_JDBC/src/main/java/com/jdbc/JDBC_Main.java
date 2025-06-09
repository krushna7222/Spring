package com.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JDBC_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com//jdbc//database_config.xml");
		
		StudentDAO stud = (StudentDAO)context.getBean("s1");
		Student st = (Student)context.getBean("stud");

//		st.setId(105);
//		st.setName("Hemant Shinde");
//		st.setCity("Satana");
		
//		int i = stud.insert(st);
		
//		System.out.println(i + " th record inserted...");

		
//		st.setId(105);
//		st.setName("Hitesh Chaudhary");
//		st.setCity("Delhi");
		
//		int i = stud.update(st);
//		System.out.println(i + " th record Updated...");
		
		
//		st.setId(105);
//		
//		int i = stud.delete(st);
//		System.out.println(i + " th record Deleted...");		
		
		
		System.out.println(stud.selectAllStudent());
		
		System.out.println(stud.selectSingleRecord(101));
	

	}

}
