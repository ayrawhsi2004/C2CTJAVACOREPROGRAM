package com.tnsif.dayfive.singleinheritance;

public class Citizen {
private String name;
private String aadhar;
private String address;
private long phno;
public Citizen() {
	System.out.println("Citizen object created");
	
	
}
public Citizen(String name, String aadhar, String address, long phno) {
	this.name = name;
	this.aadhar = aadhar;
	this.address = address;
	this.phno = phno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAadhar() {
	return aadhar;
}
public void setAadhar(String aadhar) {
	this.aadhar = aadhar;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public long getPhno() {
	return phno;
}
public void setPhno(long phno) {
	this.phno = phno;
}
@Override
public String toString() {
	return "Citizen [name=" + name + ", aadhar=" + aadhar + ", address=" + address + ", phno=" + phno + "]";
}
	
	
	
	
	
	
	
	
	
	
	

}
