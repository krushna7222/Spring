package com.di.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Emp {
	
	private int id;
	private String name;
	private List<String> phones;
	private Set<String> addresses;
	private Map<String, Integer> courses;
	private Properties props;
	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Emp(int id, String name, List<String> phones, Set<String> addresses, Map<String, Integer> courses,
			Properties props) {
		super();
		this.id = id;
		this.name = name;
		this.phones = phones;
		this.addresses = addresses;
		this.courses = courses;
		this.props = props;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public List<String> getPhones() {
		return phones;
	}

	public Set<String> getAddresses() {
		return addresses;
	}

	public Map<String, Integer> getCourses() {
		return courses;
	}

	public Properties getProps() {
		return props;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}

	public void setCourses(Map<String, Integer> courses) {
		this.courses = courses;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", phones=" + phones + ", addresses=" + addresses + ", courses="
				+ courses  + ", props=" + props + "]";
	}

}
