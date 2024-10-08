package lab6;

import java.util.Stack;

public class ArrayRev {
	public static void reversingUsingLoop(int[] arr) {
		int end = arr.length - 1;
		
		for(int i = 0; i < end; i++) {
			int temp = arr[i];
			arr[i] = arr[end];
			arr[end] = temp;
			end--;
		}
	}
	
	public static void reversingUsingStack(int[] arr) {
		Stack<Integer> data = new Stack<>();
		
		for(int num : arr) {
			data.push(num);
		}
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = data.pop();
		}
	}
	
	public static void print(int[] arr) {
		for(int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] array = {2,4,6,8,10};
		int[] array2 = array.clone();
		
		System.out.println("The current array is: ");
		print(array);
		
		reversingUsingLoop(array);
		System.out.println("\nReversing the array using the Loop");
		print(array);
		
		reversingUsingStack(array2);
		System.out.println("\nReversing the array using the Stack:");
		print(array);
	}
}
