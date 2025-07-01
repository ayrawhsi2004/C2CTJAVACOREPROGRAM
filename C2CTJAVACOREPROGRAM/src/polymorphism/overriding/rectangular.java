package polymorphism.overriding;

public class rectangular extends Shapes{
private double l,b;
public rectangular(double l,double b)
	
{
	
this.l=l;
this.b=b;
}	
	@Override
	public void calArea()
	
	{
	System.out.println("From Rectangular Class:"+(l*b));	
		
	}
	
	
	
	
	
	
	
	
	
}
