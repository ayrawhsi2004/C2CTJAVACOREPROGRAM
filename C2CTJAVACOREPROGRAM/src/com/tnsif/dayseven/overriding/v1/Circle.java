package com.tnsif.dayseven.overriding.v1;

public class Circle extends Shape{
	private double radius;
	public Circle(double radius) {
		this.radius=radius;
		
	}

@Override
public void draw() {
	
System.out.println("Drawing a circle with radius "+radius);

}
public void erase() {
	
System.out.println("Erasing a circle with radius "+radius);
}
}
