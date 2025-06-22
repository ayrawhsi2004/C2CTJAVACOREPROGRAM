package com.tnsif.daysix.firstpackage;

public class trainer extends slinheritancedemo {

	private String designation;
	private String location ;
	
	
	public trainer() {
	super();
	this.designation= "program trainer";
	this.location="chennai";
}
public trainer(int id ,String name,String city,String designation,String location){
	super(id,name,city);
	this.designation= designation;
	this.location=location;
}
	


public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}



@Override
public String toString() {
	return "trainer [id:"+getId()+"name:"+getName()+"city:" +getCity()+  "designation=" + designation + ", location=" + location + "]";





		 
}

}
