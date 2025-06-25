package com.tnsif.day4;

public class MyClasses {
private static MyClasses obj=new MyClasses();
private int id;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

private MyClasses() {
	System.out.println("MyClass object created");
	
}
public static MyClasses getObject()
{
	return obj;
	
	
	
}
@Override
public String toString() {
	return "MyClasses [id=" + id + "]";
}





}


