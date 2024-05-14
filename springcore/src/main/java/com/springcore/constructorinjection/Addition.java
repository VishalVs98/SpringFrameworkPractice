package com.springcore.constructorinjection;

public class Addition {
private int a;
private int b;
public Addition(int a, int b) {	
	this.a = a;
	this.b = b;
	System.out.println("contructor : int , int");
}
public Addition(double a, double b) {	
	this.a = (int) a;
	this.b = (int) b;
	System.out.println("contructor : double, double");
}
public void doSum() {
	System.out.println("Sum is:"+(this.a +  this.b));
}
}
