/***************************************************************
*
* Kean University
* Fall 2023
* Course: CPS*2231 - Computer Organization &Programming * Section 03
* Author: Ashley Davila
* Homework: 5
* Program Description:
***************************************************************/

package assignment5;

public class TestComputer {
	public static void main(String[] args) {
		Computer computer1 = new Computer("Dell", 1189160321024L, "April 1, 2020", 2);
		Computer computer2 = new Computer("Apple Inc", 269283712040L, "March 31, 2020", 4);
		Computer computer3 = new Computer("Apple Inc", 304712490348L, "June 16, 2020", 3);
		
		System.out.println(computer1.toString());
		System.out.println(computer2.toString());
		System.out.println(computer3.toString());
		
		Desktop desktop1 = new Desktop("Dell", 138503822356L, "January 12, 2021",4,13, 14.5);
		Desktop desktop2 = new Desktop("Lenovo", 127489503475L, "October 18, 2021", 3, 14.5,15);
		
		System.out.println();
		System.out.println(desktop1.toString());
		System.out.println(desktop2.toString());
		
		Laptop laptop1 = new Laptop("Apple Inc", 12785937237L, "September 5, 2022", 5, 10.6);
		Laptop laptop2 = new Laptop("Windows", 16495023984L, "July 12, 2021", 2, 13);
		
		System.out.println("\n" +laptop1.toString());
		System.out.println(laptop2.toString());
	}
}
