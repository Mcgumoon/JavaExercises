/***************************************************************
*
* Kean University
* Fall 2023
* Course: CPS*2231 - Computer Programming  Section 03*
* Author: Ashley Davila
* Lab: 3, task 1
* Program Description: Program that calculates how long it takes the computer to find the maximum number in the array in nanoseconds
***************************************************************/


public class task1 {
	public static void main(String[] args) {
		long begin = System.nanoTime();
		
		int[] array = new int[10];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = -100 + (int)(Math.random()* 201);
		}
		long end = System.nanoTime();
		long time = end - begin;
		
		System.out.println("The maximum value of a 10 element array is " + max(array) + " and it took " + time + " nanoseconds ");
		
		long begin2 = System.nanoTime();;
		int[] array2 = new int[10000];
		
		for (int i = 0; i < array2.length; i++) {
			array2[i] = -100 + (int)(Math.random() * 201);
		}
		
		long end2 = System.nanoTime();
		long time2 = end2 - begin2;
		
		System.out.println("The maximum value of a 10,000 array is " + max(array2) + " and it took " + time2 + " nanoseconds ");
		
		long begin3 = System.nanoTime();
		int[] array3 = new int[1000000];
		
		for (int i = 0; i < array3.length; i++) {
			array3[i] = -100 + (int)(Math.random() * 201);
		}
		
		long end3 = System.nanoTime();
		long time3 = end3 - begin3;
		
		System.out.println("The maximum value of a 10,000,000 array is " + max(array3) + " and it took " + time3 + " nanoseconds");
		
		System.out.println("");
		
		for (int i = 0; i < 88; i++) {
			System.out.print("-");
		}
		
		System.out.println("");
		System.out.printf("%-5s%-15s%-10s%-10s%-10s%-15s%-5s%-15s%-30s", "|", "Array Size", "|", "10","|", "10,000", "|", "10,000,000", "|");
		System.out.println("");
		for (int i = 0; i < 88; i++) {
			System.out.print("_");
		}
		System.out.println("");
		System.out.printf("%-5s%-15s%-10s%-10s%-10s%-15s%-5s%-15s%-30s", "|", "Time", "|", time,"|", time2, "|", time3, "|");
		
	}
	
	public static int max(int[] list) {
		int max = list[0];
		
		for (int i = 1; i < list.length; i++) {
			if(list[i] > max) {
				max = list[i];
			} 
		}
		
		return max; 
	}
}
