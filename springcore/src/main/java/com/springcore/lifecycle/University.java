package com.springcore.lifecycle;

public class University {
private int collegeId;
private int numberOfstudents;
public int getCollegeId() {
	return collegeId;
}
public void setCollegeId(int collegeId) {
	System.out.println("setting college Id");
	this.collegeId = collegeId;
}
public int getNumberOfstudents() {
	return numberOfstudents;
}
public void setNumberOfstudents(int numberOfstudents) {
	System.out.println("setting numberOfstudents");
	this.numberOfstudents = numberOfstudents;
}
public University(int collegeId, int numberOfstudents) {
	super();
	this.collegeId = collegeId;
	this.numberOfstudents = numberOfstudents;
}
public University() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return this.collegeId+" : "+this.numberOfstudents;
}
public void init() {
	System.out.println("Inside init method");
}
public void destroy() {
	System.out.println("Inside destroy method");
}

}
