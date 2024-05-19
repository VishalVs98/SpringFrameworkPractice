package com.springcore.springexpression;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
@Value("#{11+45}")
private int noOfBoys;
@Value("#{7+23}")
private int noOfGirls;
@Value("#{T(java.lang.Math).sqrt(64)}")//static method in spel
private int noOfFaculties;
@Value("#{T(java.lang.Math).PI}")
private int branch;
@Value("#{new java.lang.String('Vishal')}")
private String name;
@Value("#{8>3}")
private boolean isActive;
public int getNoOfBoys() {
	return noOfBoys;
}
public void setNoOfBoys(int noOfBoys) {
	this.noOfBoys = noOfBoys;
}
public int getNoOfGirls() {
	return noOfGirls;
}
public void setNoOfGirls(int noOfGirls) {
	this.noOfGirls = noOfGirls;
}

public int getNoOfFaculties() {
	return noOfFaculties;
}
public void setNoOfFaculties(int noOfFaculties) {
	this.noOfFaculties = noOfFaculties;
}
public int getBranch() {
	return branch;
}
public void setBranch(int branch) {
	this.branch = branch;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public boolean isActive() {
	return isActive;
}
public void setActive(boolean isActive) {
	this.isActive = isActive;
}
@Override
public String toString() {
	return "Student [noOfBoys=" + noOfBoys + ", noOfGirls=" + noOfGirls + ", noOfFaculties=" + noOfFaculties
			+ ", branch=" + branch + ", name=" + name + ", isActive=" + isActive + "]";
}




}
