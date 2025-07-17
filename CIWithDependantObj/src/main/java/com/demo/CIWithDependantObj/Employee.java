package com.demo.CIWithDependantObj;

import java.util.List;

public class Employee {
	
	
	     private int id;
	     private String name;
	     private float salary;
	     
	     //depednat object
	     private DOJ doj;
	     //CI with collection  String base
	     private List<String> designation;
          
//	     CI with collection  non string based
	     List<Address> address;
	      

		public Employee(int id, String name, float salary, DOJ doj) {
			super();
			this.id = id;
			this.name = name;
			this.salary = salary;
			this.doj = doj;
		}


			
		public Employee(int id, String name, float salary, DOJ doj, List<String> designation) {
			super();
			this.id = id;
			this.name = name;
			this.salary = salary;
			this.doj = doj;
			this.designation = designation;
		}



		public Employee(int id, String name, float salary, DOJ doj, List<String> designation, List<Address> address) {
			super();
			this.id = id;
			this.name = name;
			this.salary = salary;
			this.doj = doj;
			this.designation = designation;
			this.address = address;
		}


		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", doj=" + doj + ", designation="
					+ designation + ", address=" + address + "]";
		}
	     
	     
	     
	     
	     
	   void disp()
	   {
		   System.out.println(id+" "+name+" "+salary);
		   System.out.println("Designation of emplaoyee");
		   
		      for(String s : designation)
		      {
		    	    System.out.println(s);
		      }
		   
		      System.out.println("Addres of Employee");
		      
		        for(Address a : address)
		        {
		        	 System.out.println(a);
		        }
	   }
	     
	

}
