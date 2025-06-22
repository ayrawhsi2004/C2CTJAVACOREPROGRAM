package day6;

public class studentdemo {
	static {
	System.out.println("before main");
	}

public static void main (String[] args) {
	{
	student s= new student ();
	System.out.println(s);
	
	}
	{
	student s1= new student ();
		
	System.out.println(s1);
	{
	student s2= new student ();
	System.out.println(s2);
}
	}
	
}}