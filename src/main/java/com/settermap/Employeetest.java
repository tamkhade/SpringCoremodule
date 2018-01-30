package com.settermap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Employeetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext a=new ClassPathXmlApplicationContext("Applicationcontext.xml");
		Employeemap ma=(Employeemap) a.getBean("map");
		ma.displaypempinfo();

	}

}
