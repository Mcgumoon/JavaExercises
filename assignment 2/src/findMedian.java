/***************************************************************
****************
* Kean University
* Semester Fall 23
* Course: CPS*2231 - Computer Programming
* Section 03
* Author: Ashley Davila
* Assignment: 2
* Task # 5
* Program Description: Finds the median
****************************************************************
*********/

public class findMedian {
	public static void main(String[] args) {
		double[] array = {10, 20, 15, 25, 30};
		
		sort(array);
		double median = FindMedian(array);
		System.out.println("The median is: " + median);
	}
	
	public static double FindMedian(double[] array) {
		int length = array.length;
		double mid = 0;
		
		if (length % 2 == 1) {
			mid = array[((length + 1) / 2)- 1];
			
		} else {
			
			mid = (array[array.length / 2 - 1] + array[array.length/2]) / 2;
			
		}
		
		return mid;
	}
	
	public static void sort(double[] list) {
		for (int i = 0; i < list.length; i++) {
			double currentMin = list[i];
			int currentMinIndex = i;
			
			for (int j = i + 1; j < list.length; j++) {
				if (currentMin > list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}
			
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = (int)currentMin;
			}
		}
	}
}
