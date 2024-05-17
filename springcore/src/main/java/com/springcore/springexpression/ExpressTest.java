package com.springcore.springexpression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExpressTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/springexpression/expressconfig.xml");
		Student s=con.getBean("student", Student.class);
		System.out.println(s);
	}

}
