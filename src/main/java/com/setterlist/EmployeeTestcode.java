package com.setterlist;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class EmployeeTestcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Resource r=new ClassPathResource("Applicationcontext.xml");
		ApplicationContext a=new ClassPathXmlApplicationContext("Applicationcontext.xml");	
		Employeelist e=(Employeelist) a.getBean("emp");
		e.dispalyinfo();
	}

}
