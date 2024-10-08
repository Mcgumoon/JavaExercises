/***************************************************************
****************
* Kean University
* Semester Fall 23
* Course: CPS*2231 - Computer Programming
* Section 03
* Author: Ashley Davila
* attendance 6
****************************************************************
*********/


public class Attendance06 {
	public static void main(String[] args) {
		
	}
	
	class Circle{
		public double radius = 5.0;
		
		public Circle() {
			
		}
		
		public Circle(double newRadius) {
			radius = newRadius;
		}
		
		public double getArea() {
			return Math.PI * radius * radius;
		}
		
		public double getPerimeter() {
			return 2 * Math.PI * radius;
		}
		
		public void setRadius(double radius) {
			this.radius = radius;
		}
		
		public double getRadius() {
			return radius;
		}

		@Override
		public String toString() {
			return "Circle [radius=" + radius + "]";
		}
		
		
	}
}
