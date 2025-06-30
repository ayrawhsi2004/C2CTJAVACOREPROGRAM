package day8__interfaceexample;

public class Cloths {

	public Cloths() {
		// TODO Auto-generated constructor stub
	}

}
package com.tnsif.dayfive.association.isa;

import com.tnsif.dayfive.association.isa.Employee;
import com.tnsif.dayfive.association.isa.Manager;

public class Manager extends Employee {
private int teamSize;

public Manager() {
	super();
}

public Manager(String name, int employeeId, String department,int teamSize) {
	super(name, employeeId, department);
this.teamSize=teamSize;

}

public int getTeamSize() {
	return teamSize;
}

public void setTeamSize(int teamSize) {
	this.teamSize = teamSize;
}

@Override
public String toString() {
	return "Manager [TeamSize=" + teamSize + ",Name="+getName()+",EmployeeId"+getEmployeeId()+",Department="+getDepartment()+"]";
}





	}

package com.tnsif.dayfive.association.isa;

public class IsaDemo {
public static void main(String[] args) {
	Manager m= new Manager ("aishwarya",17,"EEE",90);
	Employee e=new Employee("jenifer",26,"IT");
	System.out.println(e);
	System.out.println(m);














}

}







package com.tnsif.dayfive.association.isa;

public class Employee {
private String name;
private int employeeId;
private String department;
public Employee() {
	super();
}
public Employee(String name, int employeeId, String department) {
	super();
	this.name = name;
	this.employeeId = employeeId;
	this.department = department;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", employeeId=" + employeeId + ", department=" + department + "]";
}

	
	
	
	
	
	
	
	
	
	
	}


