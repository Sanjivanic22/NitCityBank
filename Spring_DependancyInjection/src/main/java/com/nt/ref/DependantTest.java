package com.nt.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependantTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/nt/ref/config1.xml");
		A temp=(A)context.getBean("aref");
		System.out.println(temp.getX());
		System.out.println(temp.getObj());
		System.out.println(temp.getObj().getY());
		System.out.println(temp);

	}

}
