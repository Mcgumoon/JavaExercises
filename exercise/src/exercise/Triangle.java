/*********************************************************************
* Kean University
* Semester Fall 23
* Course: CPS*2231 - Computer Programming - Section 03
* Author: Ashley Davila
* Assignment: 4
* Question 1
* Program Description: Create a Triangle class that extends the SimpleGeometricObject class. (for
example)
*********************************************************************/

package exercise;

public class Triangle extends SimpleGeometryObject{
	public double base = 5;
	public double height = 10;
	
	public Triangle() {
		super();
	}
	
	public Triangle(double newBase, double newHeight) {
		super();
		this.base = newBase;
		this.height = newHeight;
	}
	
	
	public double getArea() {
		return (1.0/2.0) * (base * height);
	}
	
	public double getBase() {
		return base;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height + ", getArea()=" + getArea() + "]";
	}
	
	@Override
	public void testOverriding() {
		System.out.println( "This is the overridden testOverriding() method");
	}
	
}
