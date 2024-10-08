/*
**************************************************************
* Kean University
* Semester Fall 23
* Course: CPS-2231 - Se3ction 3
* Authors: Ashley Davila
* Lab: 4
* Program Description: Testing and printing the area, perimeter, and radius of the circles
**************************************************************
*/

package lab04;

public class TestCircle {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		System.out.println(c1.toString());
		System.out.println("The radius of c1 is: " + c1.getRadius());
		c1.setColor(Color.GREEN);
		
		javax.swing.JFrame frame = new javax.swing.JFrame("");
		javax.swing.JOptionPane.showMessageDialog(frame, c1.toString()," c1 information ", javax.swing.JOptionPane.INFORMATION_MESSAGE);
		
		Circle c2 = new Circle(5);
		c2.setColor(Color.WHITE);
		javax.swing.JOptionPane.showMessageDialog(frame, c2.toString()," c2 information ", javax.swing.JOptionPane.INFORMATION_MESSAGE);
		
		Circle c3 = new Circle(2);
		c3.setColor(Color.RED);
		javax.swing.JOptionPane.showMessageDialog(frame, c3.toString()," c3 information ", javax.swing.JOptionPane.INFORMATION_MESSAGE);
		
		Circle c4 = new Circle(2.5);
		c4.setColor(Color.YELLOW);
		javax.swing.JOptionPane.showMessageDialog(frame, c4.toString()," c4 information ", javax.swing.JOptionPane.INFORMATION_MESSAGE);
		
		Circle c5 = new Circle(8);
		c5.setColor(Color.BROWN);
		javax.swing.JOptionPane.showMessageDialog(frame, c5.toString()," c5 information ", javax.swing.JOptionPane.INFORMATION_MESSAGE);
	}
}
