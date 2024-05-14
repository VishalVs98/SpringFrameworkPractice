package com.springcore.constructorinjection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/constructorinjection/ciconfig.xml");
           Person temp=(Person) context.getBean("person");
           System.out.println(temp);
           Addition add=(Addition) context.getBean("add");
           add.doSum();
	}

}
