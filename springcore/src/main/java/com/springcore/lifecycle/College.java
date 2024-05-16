package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class College implements InitializingBean,DisposableBean {
private int collegeId;
private int noOfBranch;
public int getCollegeId() {
	return collegeId;
}
public void setCollegeId(int collegeId) {
	this.collegeId = collegeId;
}
public int getNoOfBranch() {
	return noOfBranch;
}
public void setNoOfBranch(int noOfBranch) {
	this.noOfBranch = noOfBranch;
}
public College() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "College [collegeId=" + collegeId + ", noOfBranch=" + noOfBranch + "]";
}
@Override
public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("taking college:init");
}
@Override
public void destroy() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("college closed");
}
}
