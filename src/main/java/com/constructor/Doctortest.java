package com.constructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class Doctortest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource r=new ClassPathResource("Applicationcontext.xml");
		BeanFactory app=new XmlBeanFactory(r);
		DoctorEmpl e=(DoctorEmpl) app.getBean("a");
		e.shows();
		
		
	}

}
