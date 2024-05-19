package com.springcore.javaconfig;

import org.springframework.stereotype.Component;


public class Student {
private Branch branch;
public Branch getSubject() {
	return branch;
}
public void setSubject(Branch subject) {
	this.branch = subject;
}
public Student(Branch subject) {
	super();
	this.branch = subject;
}
public void study() {
	this.branch.display();
	System.out.println("student is studying");
}
}
