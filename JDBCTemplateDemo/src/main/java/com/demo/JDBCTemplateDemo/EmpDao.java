package com.demo.JDBCTemplateDemo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;

public class EmpDao {
	
	 JdbcTemplate template;
	 

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}



				//save
//                 public int saveEmp(Employee e)
//                 {
//                	 
//                	  String s1="insert into emp values('"+e.getId()+"','"+e.getName()+"','"+e.getSalary()+"')";
//                	 
//                	 
//                	    return template.update(s1);
//                	 
//                 }
	
	  //usig preapared statement
	
	 public Boolean saveEmp(Employee e)
     {
    	 
    	  String s1="insert into emp values(?,?,?)";
    	 
    	 
    	    return template.execute(s1, new PreparedStatementCallback<Boolean>() {

				@Override
				public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
					
					       ps.setInt(1, e.getId());
					       ps.setString(2, e.getName());
					       ps.setFloat(3, e.getSalary());
					
					
					return ps.execute();
				}
    	    	
    	    	          
    	    });
     }
	
	
	
                 //update
                 
                 
                  public int update(Employee e)
                  {
                	String s1="update  emp set name='"+e.getName()+"', salary='"+e.getSalary()+"' where id='"+e.getId()+"'   ";  
                	  
                	  return template.update(s1);
                	  
                  }
                 
                  
                  public int deletEmp(Employee e)
                  {
                	      String s="delete from emp where id='"+e.getId()+"'";
                	      
                	      return template.update(s);
                  }
                 
                  
                  
                  //getrecord
                  
                  public  List<Employee> getAllEMp()
                  {
                	   
                	  
                	  
                    return  template.query("select * from emp", new ResultSetExtractor<List<Employee>>() {

						@Override
						public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
							
							   ArrayList<Employee> list=new  ArrayList<Employee>();    
		                	        while(rs.next())
		                	        {
		                	        	   Employee e= new Employee();
		                	        	   e.setId(rs.getInt(1));
		                	        	   e.setName(rs.getString(2));
		                	        	   e.setSalary(rs.getFloat(3));
		                	        	   
		                	        	   list.add(e);
		                	        	
		                	        }
							return list;
						}
                    	
                    	
                    	
                    	
                    });
                	  
                	  
                  }
                  
                  
                  
                 
}           





