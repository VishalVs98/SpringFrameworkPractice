package com.springcore.springexpression;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
@Value("#{11+45}")
private int noOfBoys;
@Value("#{7+23}")
private int noOfGirls;
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
@Override
public String toString() {
	return "Student [noOfBoys=" + noOfBoys + ", noOfGirls=" + noOfGirls + "]";
}
}
