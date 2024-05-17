package com.springcore.autowiring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ApplicationContext con= new ClassPathXmlApplicationContext("com/springcore/autowiring/autoconfig.xml");
    Emp emp1=con.getBean("emp1", Emp.class);
     System.out.println(emp1);
	}

}
