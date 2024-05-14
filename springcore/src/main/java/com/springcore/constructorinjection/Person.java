package com.springcore.constructorinjection;

public class Person {
private String name;
private int id;
private Certi cert;
public Person(String name, int id,Certi cert) {
	this.name = name;
	this.id = id;
	this.cert=cert;
}
@Override
public String toString() {
	return this.name+" : "+this.id+" : "+this.cert;
}
}
