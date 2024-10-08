package lab3;

import java.util.*;

public class lab3Part3 {
	public static void main(String[] args) {
		int[] list = {6,3,1,2,7,12,11,10};
		reverse(list,0, list.length - 1);
		System.out.println(Arrays.toString(list));
	}
	
	public static void reverse(int array[], int min, int max) {
		if(min < max) {
			int temp = array[min];
			array[min] = array[max];
			array[max] = temp;
			reverse(array, min+1,max-1);
			
		}
	}
}
