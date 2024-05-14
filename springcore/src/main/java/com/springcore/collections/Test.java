package com.springcore.collections;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collections/collectionconfig.xml");
   Employees emp= (Employees) context.getBean("emp1");
   System.out.println(emp.getEmployeeNames());
   System.out.println(emp.getPhones());
   System.out.println(emp.getCourses());
   System.out.println(emp.getAddresses());
	
	}

}
