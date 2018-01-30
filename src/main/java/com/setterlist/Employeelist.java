package com.setterlist;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Employeelist {

	int empid;
	
	String empname;
	
	List<String> emplist;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public List<String> getEmplist() {
		return emplist;
	}

	public void setEmplist(List<String> emplist) {
		this.emplist = emplist;
	}
	
	void dispalyinfo()
	{
		System.out.println(empid+" "+empname);
		
		System.out.println("employee list");
		
		 Iterator<String> itr=emplist.iterator();  
		    while(itr.hasNext()){  
		        System.out.println(itr.next());  
		    }  
		
	}
	
}
