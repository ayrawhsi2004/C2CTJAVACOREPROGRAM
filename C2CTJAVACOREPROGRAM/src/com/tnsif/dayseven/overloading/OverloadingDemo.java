package com.tnsif.dayseven.overloading;

public class OverloadingDemo {

	public static void main(String[] args) {
System.out.println("------------Constructor Overloading-------------");
Point p=new Point(0);
System.out.println(p);

Point p1=new Point(14.5f);
System.out.println(p1);
Point p2=new Point(12.5f,20.5f);
System.out.println(p2);

	
	
	System.out.println("----------Method Overloading----------");
	
	
	System.out.println("Addition of two integers :"+MethodOverLoading.addition(10,20));
	System.out.println("Addition of two floating numbers :"+MethodOverLoading.addition(10.0f,20.0f));
	System.out.println("Addition of one integer and one float :"+MethodOverLoading.addition(10,20.0f));
	System.out.println("Addition of one float and one integer :"+MethodOverLoading.addition(10.0f,20));
	System.out.println("Addition of two String :"+MethodOverLoading.addition("Hello","world"));

	
	
	
	
	
	
	
	
	
	
	
	}

}
