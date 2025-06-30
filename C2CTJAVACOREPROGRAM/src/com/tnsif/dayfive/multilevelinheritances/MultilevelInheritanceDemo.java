package com.tnsif.dayfive.multilevelinheritances;
import java.text.SimpleDateFormat;
import java.util.Date;
public class MultilevelInheritanceDemo {
public static void main (String[] args) {
try{
	SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
	Date dob1=sdf.parse("02-12-2000");
	Date dob2=sdf.parse("07-05-1995");
	Date dob3=sdf.parse("02-02-1988");
Person p1=new Person("Ishwarya",9962444283L,dob1);

System.out.println(p1);
p1=new Employee("jeni",657908986L,dob2,"Sales",45000);
System.out.println(p1);


p1=new LevelOneEmployee("madi",687875676L,dob3,"Account",58999,799,"Signing Authority");
System.out.println(p1);
}
catch(Exception e) {

	System.out.println("Date parsing error:"+e);


}}}
