package com.nt.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext context=new  ClassPathXmlApplicationContext("com/nt/main/student.xml");
	Student std=(Student)context.getBean("s1");
	Student std1=(Student)context.getBean("s2");
	System.out.println(std);
	System.out.println(std1);
}
}
