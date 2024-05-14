package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employees {
private String employeeNames;
private List<String> phones;
private Set<String> addresses;
private Map<String,String>courses;
public String getEmployeeNames() {
	return employeeNames;
}
public void setEmployeeNames(String employeeNames) {
	this.employeeNames = employeeNames;
}
public List<String> getPhones() {
	return phones;
}
public void setPhones(List<String> phones) {
	this.phones = phones;
}
public Set<String> getAddresses() {
	return addresses;
}
public void setAddresses(Set<String> addresses) {
	this.addresses = addresses;
}
public Map<String, String> getCourses() {
	return courses;
}
public void setCourses(Map<String, String> courses) {
	this.courses = courses;
}
public Employees() {
	super();
	// TODO Auto-generated constructor stub
}
public Employees(String employeeNames, List<String> phones, Set<String> addresses, Map<String, String> courses) {
	super();
	this.employeeNames = employeeNames;
	this.phones = phones;
	this.addresses = addresses;
	this.courses = courses;
}
}
