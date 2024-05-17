package com.springcore.streo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class StreaoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/streo/streoconfig.xml");
		Student p=con.getBean("student",Student.class);
		System.out.println("++++++++++++=====Student bean scope using annotation=====+++++++");	
		System.out.println(p);
		System.out.println(p.hashCode());
		Student p1=con.getBean("student",Student.class);
		System.out.println(p1);
		System.out.println(p1.hashCode());
		System.out.println("++++++++++++=====Teacher bean scope using xml config=====+++++++");
		Teacher t1=con.getBean("teacher",Teacher.class);
		System.out.println(t1.hashCode());
		Teacher t2=con.getBean("teacher",Teacher.class);
		System.out.println(t2.hashCode());
	
	}

}
