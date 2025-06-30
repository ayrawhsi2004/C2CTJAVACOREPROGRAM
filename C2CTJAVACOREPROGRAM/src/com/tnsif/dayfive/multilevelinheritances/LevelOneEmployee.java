package com.tnsif.dayfive.multilevelinheritances;
import java.util.Date;
public class LevelOneEmployee extends Employee {
private int noOfshares;
private String authority;
public LevelOneEmployee() {}
public LevelOneEmployee(String name,long contactNo,Date dateOfBirth,String deptName,double baseSalary,int noOfShares,String authority) {
super(name,contactNo,dateOfBirth,deptName,baseSalary)	;
this.noOfshares=noOfShares;
this.authority=authority;
	
}
public int getNoOfshares() {
	return noOfshares;
}
public void setNoOfshares(int noOfshares) {
	this.noOfshares = noOfshares;
}
public String getAuthority() {
	return authority;
}
public void setAuthority(String authority) {
	this.authority = authority;
}
@Override
public String toString() {
	return "LevelOneEmployee ["+super.toString()+"noOfshares=" + noOfshares + ", authority=" + authority + "]";
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}



