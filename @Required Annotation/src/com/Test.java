package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.FileUrlResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		
		/*ApplicationContext ac=new ClassPathXmlApplicationContext("com/Spring.xml");
		Employee emp=ac.getBean("emp",Employee.class);
		System.out.println(emp);*/
		
		/*Resource re=new ClassPathResource("com/Spring.xml");
		BeanFactory bf=new XmlBeanFactory(re);
		Employee emp=bf.getBean("emp",Employee.class);
		System.out.println(emp);*/
		
	/*	Resource re=new FileSystemResource("com/Spring.xml");
		BeanFactory bf=new XmlBeanFactory(re);
		Employee emp=bf.getBean("emp",Employee.class);
		System.out.println(emp);*/
		
	/*	ApplicationContext ac=new FileSystemXmlApplicationContext("com/Spring.xml");
		Employee emp=ac.getBean("emp",Employee.class);
		System.out.println(emp);*/
		
		
	}
}
