package com.tnsif.day3;

public class Customer {
private String customerName;
private int customerId;
private String customerCity;
public Customer() {
	System.out.println("Default constuctor");
}
public Customer(String customerName, int customerId, String customerCity) {
	this();
	System.out.println("parameterized constructor");

	this.customerName = customerName;
	this.customerId = customerId;
	this.customerCity = customerCity;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public String getCustomerCity() {
	return customerCity;
}
public void setCustomerCity(String customerCity) {
	this.customerCity = customerCity;
}
@Override
public String toString() {
	return "Customer [customerName=" + customerName + ", customerId=" + customerId + ", customerCity=" + customerCity
			+ "]";
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}


