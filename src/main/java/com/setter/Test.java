package com.setter;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class Test {

	public static void main(String[] args)
	{
		Resource r=new ClassPathResource("Applicationcontext.xml");
		
		BeanFactory b=new XmlBeanFactory(r);
		Employee e=(Employee) b.getBean("obj");
		e.display();
	}
	
}
