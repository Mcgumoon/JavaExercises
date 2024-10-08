/***************************************************************
*
* Kean University
* Fall 2023
* Course: CPS*2231 - Computer Programming - Section 03*
* Author: Ashley Davila
* Lab: 3, task 2
* Program Description: Writes a 5x5 matrix with random numbers, if the value number of an element is even it will multiply by 10
* and calculates the sum of the numbers for each row. 
***************************************************************/

public class task2 {
	public static void main(String[] args) {
		int[][] array = new int[5][5];
		
		System.out.println("Initial Matrix");
		
		for (int row = 0; row < array.length; row++) {
			
			
			for(int column = 0; column < array.length; column++) {
				array[row][column]= (int)(Math.random() * 101);
				
				System.out.printf("%-5s",array[row][column] + "|");

			}
			
			System.out.println("\n");
		}
		
		System.out.println("New Matrix");
		newArray(array);
		
		sum(array);
		
	}
	
	public static void newArray(int[][] list) {
		for (int row = 0; row < list.length; row++) {
			for (int column = 0; column < list.length; column++) {
				
				int temp = list[row][column];
				
				
				if (temp%2 == 0) {
					list[row][column] *= 10;
				}
				
				
				System.out.printf("%-6s", list[row][column] + "|");
			}
			
			System.out.println("\n");
		}
	}
	
	public static void sum(int[][] sumArray) {
		int totalSum = 0;
		
		for (int row = 0; row < sumArray.length; row++) {
			for (int column = 0; column < sumArray.length; column++) {
				totalSum += sumArray[row][column];
				
			}
			System.out.println("The sum for row " + row + " is " + totalSum);
		}
	}
}
