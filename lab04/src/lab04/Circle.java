/*
**************************************************************
* Kean University
* Semester Fall 23
* Course: CPS-2231 - Computer Programming
* Authors: Ashley Davila Section 03
* Lab: 4
* Task 1
* Program Description: code of methods and constructors to make a circle
**************************************************************
*/

package lab04;


enum Color {
	WHITE, YELLOW, RED, GREEN, BLUE, BROWN, BLACK;
}
public class Circle {
	
	double radius = 1.0;
	Color color;
	
	public Circle(double radius, Color color) {
		//super();
		this.radius = radius;
		this.color = color;
	}	
	public Circle(double newRadius) {
		radius = newRadius;
	}
	
	public Circle(Color color) {
		this.color = color;
	}
	public Circle() {
		//super();
		// TODO Auto-generated constructor stub
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public Color getColor() {
		return color;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	@Override
	
	public String toString() {
		return "The Circle characteristics are: radius=" + radius + ", color=" + color + "." + "\nDiameter is: " + this.getDiameter() + "."
				+ "\nPerimeter is: " + this.getPerimeter() + "." + "\nArea is: " + this.getArea() + ".";
	}
	
	public double getDiameter() {
		return radius * 2;
	}
	
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	public double getPerimeter() {
		return radius * 2 * Math.PI; 
	}
	
}
