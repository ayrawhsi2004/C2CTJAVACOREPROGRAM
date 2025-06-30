import com.Ishwarya.Assignment.employees.Developer;
import com.Ishwarya.Assignment.employees.Manager;
import com.Ishwarya.Assignment.utilities.EmployeeUtilities;

public class AssignmentMain {

	public static void main(String[] args) {
		
	Manager m=new Manager("ishwarya",101,68679,"Hr");
	Developer d = new Developer("Priya",102,6000,"Java");
	System.out.println("-----Manager Details------");
	EmployeeUtilities.displayEmployeeDetails(m);
	System.out.println("Department:"+m.getDepartment());
	
		
	System.out.println("\n--------Developer Detaila-----");
	EmployeeUtilities.displayEmployeeDetails(m);
	System.out.println("Programming Language:"+d.getProgrammingLanguage());
	
	System.out.println("\n--------Increasing Salaries-----");

	EmployeeUtilities.increaseSalary(m,10);
	EmployeeUtilities.increaseSalary(d,50);

		System.out.println("\n ------ Updated Manager Salary------");
		EmployeeUtilities.displayEmployeeDetails(m);
		System.out.println("\n ------ Updated Developer Salary------");

		EmployeeUtilities.displayEmployeeDetails(d);

		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}






