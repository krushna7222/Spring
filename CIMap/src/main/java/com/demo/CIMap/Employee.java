package com.demo.CIMap;

import java.util.Map;

public class Employee {

	     Map<Integer, String>  Designation;
	     Map<Integer, Department>  dep;

		public Employee(Map<Integer, String> designation) {
			super();
			Designation = designation;
		}

		
		
		
		
		public Employee(Map<Integer, String> designation, Map<Integer, Department> dep) {
			super();
			Designation = designation;
			this.dep = dep;
		}





		@Override
		public String toString() {
			return "Employee [Designation=" + Designation + ", dep=" + dep + "]";
		}
	     
	     
	        
	
}
