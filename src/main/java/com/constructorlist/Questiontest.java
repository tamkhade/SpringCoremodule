package com.constructorlist;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Questiontest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource r=new ClassPathResource("Applicationcontext.xml");
		BeanFactory app=new XmlBeanFactory(r);
		 QuestionAns q=(QuestionAns) app.getBean("list");
		 q.display();
	}

}
