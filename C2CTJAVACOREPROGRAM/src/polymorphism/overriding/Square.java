package polymorphism.overriding;

public class Square  extends Shapes{
public Square(float area)
{
	
super.area=area;

}
@Override
public void calArea() {
	
	
System.out.println("From square class:"+(super.area*super.area));	
	
	
}
}
