package com.demo.SIDemo1;

public class DOJ {
	
	  private int date,year;
	  String month;
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	@Override
	public String toString() {
		return "DOJ [date=" + date + ", year=" + year + ", month=" + month + "]";
	}
	  
	  
	  

}
