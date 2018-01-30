package com.constructormap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Constructortest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ApplicationContext a= new ClassPathXmlApplicationContext("Applicationcontext.xml");
	
	Constructormap c=(Constructormap) a.getBean("cmap");
		c.displaymapinfo();
	}



}
