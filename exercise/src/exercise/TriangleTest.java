/*********************************************************************
* Kean University
* Semester Fall 23
* Course: CPS*2231 - Computer Programming - Section 03
* Author: Ashley Davila
* Assignment: 4
* Question 1 Task 2
* Program Description: Create a Triangle class that extends the SimpleGeometricObject class. (for
example)
*********************************************************************/

package exercise;

public class TriangleTest {
	public static void main(String[] args) {
		Triangle triangle1 = new Triangle();
		Triangle triangle2 = new Triangle(3,4);
		
		System.out.println(triangle1.toString());
		System.out.println(triangle2.toString());
		
		triangle1.testOverriding();
		triangle2.testOverriding();
		
	}
}
