package com.di.property_injection;

public class Student {
	
	private int studentId;
	private String studentName;
	private long studentPhone;
	private String studentAddress;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studentId, String studentName, long studentPhone, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentPhone = studentPhone;
		this.studentAddress = studentAddress;
	}

	public int getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public long getStudentPhone() {
		return studentPhone;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setStudentPhone(long studentPhone) {
		this.studentPhone = studentPhone;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentPhone=" + studentPhone
				+ ", studentAddress=" + studentAddress + "]";
	}
	
}
