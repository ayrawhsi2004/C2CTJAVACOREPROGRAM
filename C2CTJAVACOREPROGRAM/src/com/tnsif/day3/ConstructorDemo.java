package com.tnsif.day3;
import java.util.Scanner;

public class ConstructorDemo {
public static void main(String[] args) {
	
	Scanner ishu=new Scanner(System.in);
	String name,city;
	int id ;
	System.out.print("enter customer id:");
	id=ishu.nextInt();
	ishu.nextLine();
	System.out.print("enter customer name:");

	name=ishu.nextLine();
	
	
	System.out.print("enter customer city:");

	city=ishu.nextLine();
	
	
	
	System.out.println("");
	Customer c1=new Customer();
	c1.setCustomerName(name);
	
	c1.setCustomerId(id);
	c1.setCustomerCity(city);
	System.out.println(c1);
	System.out.print("enter customer id:");
	id=ishu.nextInt();
	ishu.nextLine();
	System.out.print("enter customer name:");

	name=ishu.nextLine();
	
	
	System.out.print("enter customer city:");

	city=ishu.nextLine();
	Customer c2=new Customer(name,id,city);
	System.out.println(c2);
	ishu.close();


	
	}

}
