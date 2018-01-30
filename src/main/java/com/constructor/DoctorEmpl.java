package com.constructor;

/**
 * to display the name and id using constructor
 * 
 */
public class DoctorEmpl {

	int qid;
	String Doctorname;
	public DoctorEmpl(int qid,String doctorname) {
		// TODO Auto-generated constructor stub
		this.qid=qid;
		this.Doctorname=doctorname;
	}
	void shows()
	{
		System.out.println(qid+" "+Doctorname);
	}
		
}
