/*********************************************************************
* Kean University
* Semester Fall 23
* Course: CPS*2231 - Computer Programming - Section 03
* Author: Ashley Davila
* Assignment: 4
* Question 2 Task 1 & 2
* Program Description: Create a 1D array and compare string vs string builder
*********************************************************************/

package exercise;

public class question2_AD {
	public static void main(String[] args) {
		int[] array = new int[5000];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		
		String newArray = "";
		
		long begin, end,time;
		begin = System.nanoTime();
		for(int i = 0; i < array.length; i++) {
			newArray += array[i] + "";
		}
		end = System.nanoTime();
		time = end - begin;
		
		System.out.print(newArray);
		System.out.println("\nIt took " + time + " nanoseconds to append " + array.length + " integers to the String.");
		
//		StringBuilder
		StringBuilder stringBuilder = new StringBuilder();
		
		begin = System.nanoTime();
		for(int i = 0; i < array.length; i++) {
			stringBuilder.append(array[i]);
		}
		end = System.nanoTime();
		time = end - begin;
		
		System.out.println("\nIt took " + time + " nanoseconds to append " + array.length + " integers to the String.");
		
		
		
	}
	
	
}
