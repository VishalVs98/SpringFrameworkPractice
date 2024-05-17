package com.springcore.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
@Autowired//we will get error if we initialise any other bean so for that resolution we can use  qualifier annotation
@Qualifier("tempaddress1")
private Address address;

public Address getAddress() {
	return address;
}
//we can autowired here
public void setAddress(Address address) {
	this.address = address;
}

public Emp() {
	super();
	// TODO Auto-generated constructor stub
}
//here also we can use autowired annotation
public Emp(Address address) {
	super();
	this.address = address;
}

@Override
public String toString() {
	return "Emp [address=" + address + "]";
}
}
