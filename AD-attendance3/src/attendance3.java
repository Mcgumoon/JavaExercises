/***************************************************************
****************
* Kean University
* Semester Fall 23
* Course: CPS*2231 - Computer Programming
* Section: 03
* Author(s): Ashley Davila
* 
* attendance 3
* 
****************************************************************
*********/

import java.util.Scanner;

public class attendance3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int arr[] = new int[4];
		int sum = 0;
		
		System.out.println("Please enter 4 values: ");
		
		for(int i = 0; i <arr.length; i++) {
			arr[i] = input.nextInt();
			sum += arr[i];
		}
		input.close();
		
		System.out.println("The total sum of the numbers is: " + sum);
		
	}
}
