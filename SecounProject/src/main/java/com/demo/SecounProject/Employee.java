package com.demo.SecounProject;

public class Employee {
	
	
	     private int id;
	     private String name;
	     private float salary;
	     
	     
	     
	     
	     
		public Employee() {
			System.out.println("default constructore..");
		}





		public Employee(int id, String name, float salary) {
			System.out.println("parametrised constructore call..");
			
			this.id = id;
			this.name = name;
			this.salary = salary;
		}


		public Employee(int id ) {
			System.out.println("parametrised constructore call..");
			
			this.id = id;
		
			
		}

		public Employee(String name ) {
			System.out.println("parametrised constructore call..");
			
			this.name=name;
		
			
		}



		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
		}
	     
	

}
