package com.tnsif.day4;

public class Base {
int varDefault=34;
public int varPublic=89;
private int varPrivate=67;
protected int varProtected=76;
void methodDefault()
{
	System.out.println("Default access Base class");
	System.out.println("Default Variable:"+varDefault);
	
}
public void methodPublic()
{
	
	System.out.println("Public access Base class");
	System.out.println("Public Variable:"+varPublic);
}	
private void methodPrivate()
{
	
	
		System.out.println("Private access Base class");
		System.out.println("Private Variable:"+varPrivate);
}
		protected void methodProtected()
		{
			
			
				System.out.println("Protected access Base class");
				System.out.println("Protected Variable:"+varProtected);
				

}


	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


