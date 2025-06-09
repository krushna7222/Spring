package com.jdbc;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDAO {

	@Autowired
	private JdbcTemplate jdbcTemp;
	
	public int insert(Student st) {
		
		String s = "insert into student values(?,?,?)";
		
		int i = jdbcTemp.update(s, st.getId(),st.getName(),st.getCity());
		
		return i;
	}
	
	public int update(Student st) {
		
		String s = "update student set name=?, city=? where id=?";
		
		int i = jdbcTemp.update(s, st.getName(),st.getCity(),st.getId());
	
		return i;
	}
	
	public int delete(Student st) {
		
		String s = "delete from student where id=?";
		
		int i = jdbcTemp.update(s, st.getId());
	
		return i;
	}
	
	public List<Map<String, Object>> selectAllStudent() {
		
		String s = "select * from student";
		
		List<Map<String, Object>> l1 =  jdbcTemp.queryForList(s);
		
//		System.out.println(l1);
	
		return l1;
	}
	
	public List<Map<String, Object>> selectSingleRecord(int id) {
		
		String s = "select * from student where id=?";
		
		List<Map<String, Object>> l1 =  jdbcTemp.queryForList(s,id);
		
//		System.out.println(l1);
	
		return l1;	
	}

}
