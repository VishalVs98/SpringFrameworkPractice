package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleSpringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		University  uni =(University) context.getBean("uni1");
		System.out.println(uni);
		//registering shutdown hook which is present in AbstractApplicationContext interface,not in ApplicationContext
		context.registerShutdownHook();
		System.out.println("-----------------------------------------------------------");
		//init and destroy method implemented using interfaces-
		College  col =(College) context.getBean("col1");
		System.out.println(col);
		
		Example ex =(Example ) context.getBean("ex1");
		System.out.println(ex);
	}

}
