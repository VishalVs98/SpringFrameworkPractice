package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages="com.springcore.javaconfig")//this is used when
//we will component annotation,in case bean it  doesn't required
public class Javaconfig {
 //By using bean annoation
	@Bean
	public Student  getStudent() {
		Student st=new Student(getBranch());
		return st;
	}
	@Bean
	public Branch  getBranch() {
		Branch st=new Branch();
		return st;
	}
}
