package com.Ishwarya.Assignment.utilities;
import com.Ishwarya.Assignment.employees.Employee;
public class EmployeeUtilities {
public static void displayEmployeeDetails(Employee emp) {
	System.out.println("Employee Name:"+emp.getName());
	System.out.println("Employee ID:"+emp.getEmployeeId());
	System.out.println("Salary:"+emp.getSalary());
}


public static void increaseSalary(Employee emp,double percent) {
	double newSalary=emp.getSalary()+(emp.getSalary()*percent/100);
	emp.setSalary(newSalary);
}









}


