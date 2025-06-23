package com.tnsif.day3;
import java.util.Scanner;
public class PersonDemo {

public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	String name;
	System.out.println("enter the name:");
	name=sc.next();
	System.out.println("enter the age:");
int age=sc.nextInt();
System.out.println("enter the gender:");
String gender= sc.next();
System.out.println("enter the tax:");


int tax=sc.nextInt();
Person p=new Person();
p.setName(name);
p.setAge(age);
p.setGender(gender);
p.setTax(tax);
System.out.println(p);

TaxCalculation cal=new TaxCalculation();
cal.calculateTax(p);
System.out.println("After calc tax");
System.out.println(p);
sc.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}
