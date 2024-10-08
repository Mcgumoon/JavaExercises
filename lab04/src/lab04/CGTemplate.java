/*
**************************************************************
* Kean University
* Semester Fall 23
* Course: CPS-2231 - Section 3
* Authors: Ashley Davila
* Lab: 4
* Program Description: Displays 5 circles of various colors
**************************************************************
*/

package lab04;

import java.awt.*;
import java.awt.event.*; 
import javax.swing.*; 

public class CGTemplate extends JFrame {
public static final int CANVAS_WIDTH = 640;
public static final int CANVAS_HEIGHT = 480;
private DrawCanvas canvas;

// Constructor to set up the GUI components and event handlers
public CGTemplate() {
	canvas = new DrawCanvas(); 

	canvas.setPreferredSize(new Dimension(CANVAS_WIDTH,CANVAS_HEIGHT));
	Container cp = getContentPane();
	cp.add(canvas);
	setDefaultCloseOperation(EXIT_ON_CLOSE); 

	pack(); // Either pack() the components; or

	setTitle("Lab4 s make a Circle"); 

	setVisible(true); // "super" JFrame show
}

private class DrawCanvas extends JPanel {

@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g); 
		setBackground(java.awt.Color.BLUE);
		
//Attention: this part is where you need to write code
//and finish.
// TO-DO List: Create Five Circles:
// C1: Color: Green, Radius: 1
// C2: Color: White, Radius: 5
// C3: Color: Red, Radius: 2
// C4: Color: Yellow, Radius: 2.5
// C5: Color: Black, Radius: 8
// First Circle, it is an example
		g.setColor(java.awt.Color.GREEN); 
		g.fillOval(50, 50, 100, 100); // first two numbers are X&Y

// Second Circle, it is the second example
		g.setColor(java.awt.Color.WHITE); // set the drawing
		g.fillOval(200, 50, 500, 500);
// Please create the code for C3 here
		g.setColor(java.awt.Color.RED);
		g.fillOval(100, 100, 200, 200);
// Please create the code for C4 here
		g.setColor(java.awt.Color.YELLOW);
		g.fillOval(300, 300, 250, 250);
// Please create the code for C5 here
		g.setColor(java.awt.Color.BLACK);
		g.fillOval(400, 400, 800, 800);
		g.setFont(new Font("Monospaced", Font.PLAIN, 12));
		g.drawString("Circles c1, c2, c3, c4 and c5", 10, 20);
}
}
public static void main(String[] args) {
SwingUtilities.invokeLater(new Runnable() {
@Override
public void run() {
new CGTemplate();
}
});
}
}