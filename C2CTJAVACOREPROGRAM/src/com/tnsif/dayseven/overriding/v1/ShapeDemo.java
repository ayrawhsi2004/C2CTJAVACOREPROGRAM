package com.tnsif.dayseven.overriding.v1;

public class ShapeDemo {

	public static void main (String[] args) {
	
	
	Shape[] shapes=new Shape[3] ;
	
	shapes[0]=new Circle(3.5);
	shapes[1]=new triangle(5.9,7.0);
	shapes[2]=new Square(6.0);
	
	
	for (Shape shape :shapes) {
		
		shape.draw();
		shape.erase();
System.out.println("------------");
	}
	}
	
	
	
}
