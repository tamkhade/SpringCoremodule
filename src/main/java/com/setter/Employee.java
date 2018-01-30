package com.setter;

public class Employee {
	
	private int id;
	private String Employeename;
	private String city;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmployeename() {
		return Employeename;
	}
	public void setEmployeename(String employeename) {
		Employeename = employeename;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	void display()
	{
		
		System.out.println(id+" "+Employeename+" "+city);
	}
	

}
