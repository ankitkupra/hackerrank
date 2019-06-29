package com.hackerrank.java.pojo;

public class Student {

	protected String firstName;
	protected int std_id;
	protected double cgpa;
	
	
	public Student(int std_id, String firstName, double cgpa) {
		super();
		this.firstName = firstName;
		this.std_id = std_id;
		this.cgpa = cgpa;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getStd_id() {
		return std_id;
	}
	public void setStd_id(int std_id) {
		this.std_id = std_id;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

}
