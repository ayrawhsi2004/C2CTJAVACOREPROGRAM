package com.tnsif.dayseven.overriding.v1;

public class triangle extends Shape {

	private double base;
	private double height;

	public triangle (double base,double height) {
	this.base=base;
	this.height=height;

	}@Override
public void draw() {
	
System.out.println("Drawing a triangle with base "+base+"and height"+height);

}
	@Override

public void erase() {
	
System.out.println("Erasing a triangle with base "+base+"and height"+height);
}
}
