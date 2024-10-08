/***************************************************************
****************
* Kean University
* Semester Fall 23
* Course: CPS*2231 - Computer Programming
* Section 03
* Author: Ashley Davila
* Assignment: 2
* Task # 4
* Program Description: Searches the number you are looking for in a descending order
****************************************************************
*********/

public class binarySearch2 {
	public static void main(String[] args) {
		int[] myList = {20, 12, 10, 7, 5, 3, 2};
		int result = BinarySearch(myList, 20);
		
		if(result == -1) {
			System.out.println("Not found!");
		} else {
			System.out.println("The index of the input key is " + result + ".");
		}
	}
	
	public static int BinarySearch(int[] list, int key) {
		int low = 0;
		int high = list.length - 1;
		
		while (high >= low) {
			int mid = (low + high) / 2;
			
			if(key > list[mid]) {
				high = mid - 1;
			} else if (key == list[mid]) {
				return mid;
			} else {
				low = mid + 1;
			}
		}
		
		return -1 -low;
	}
}
