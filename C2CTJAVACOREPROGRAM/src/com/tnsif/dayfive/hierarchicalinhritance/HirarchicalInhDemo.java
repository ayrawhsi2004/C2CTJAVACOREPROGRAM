package com.tnsif.dayfive.hierarchicalinhritance;

public class HirarchicalInhDemo {


public static void main(String[] args) {
	Person p1=new Person();
	System.out.println("----------------PersonDetails-----------------");
	System.out.println(p1);
	Person p=new Person("Dhruv","Mumbai");
	if(p instanceof Person)
		System.out.println("PersonDetails "+p);
	
 Employee e=new Employee("Ishwarya","Chennai",24,757667,"Sales");
	
	p=e;
	if(p instanceof Employee)
		System.out.println("employeeDetails "+e);

	Student s=new Student("jeni","chennai","UI",89);
	p=s;
	if(p instanceof Student)
		System.out.println("StudentDetails "+s);
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}



}
