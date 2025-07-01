package exceptionhandling_example;

public class ExceptionExample {

	public static void main (String[]  args) {
		try{
	int a []= {6,7,8,4};
	System.out.println(a[5]);
	System.out.println("next line");

		}
		
		catch(ArrayIndexOutOfBoundsException ae)
		{
		
		System.err.println("exception occured"+ae.getMessage());
		}{
		System.out.println("next line")	;
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
}
}