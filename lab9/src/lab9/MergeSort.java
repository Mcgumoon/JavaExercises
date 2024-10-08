package lab9;

public class MergeSort {
	public static void mergeSort(int[] array) {
		if(array.length <= 1) {
			return;
		}
		
		int mid = array.length / 2;
		int[] left = new int[mid];
		int[] right = new int[array.length - mid];
		
		for(int index = 0; index < mid; index++) {
			left[index] = array[index];
		}
		
		for(int index = mid; index < array.length; index++) {
			right[index - mid] = array[index];
		}
		
		mergeSort(left);
		mergeSort(right);
		
		merge(left, right, array);
	}
	
	private static void merge(int[] left, int[] right, int[] data) {
		int leftIn = 0;
		int rightIn = 0;
		int dataIn = 0;
		
		while(leftIn < left.length && rightIn < right.length) {
			if(left[leftIn] <= right[rightIn]) {
				data[dataIn++] = left[leftIn++];
			} else {
				data[dataIn++] = right[rightIn++];
			}
		}
		
		while(leftIn < left.length) {
			data[dataIn++] = left[leftIn++];
		}
		
		while(rightIn < right.length) {
			data[dataIn++] = right[rightIn++];
		}
	}
	
	public static void main(String[] args) {
		//test 1
		int[] array1 = {14, 12, 13, 8, 6, 4};
		System.out.println("The original array for test 1 is: ");
		printArray(array1);
		mergeSort(array1);
		System.out.println("The sorted array for test 1 is: ");
		printArray(array1);
		
		
		//test 2
		int[] array2 = {20, 50, 1, 15, 8, 22};
		System.out.println("The original array for test 2 is: ");
		printArray(array2);
		mergeSort(array2);
		System.out.println("The sorted array for test 2 is: ");
		printArray(array2);
		
		//test 3
		int[] array3 = {4, 2, 6, 3, 7, 1, 8, 5, 9};
		System.out.println("The original array for test 3 is: ");
		printArray(array3);
		mergeSort(array3);
		System.out.println("The sorted array for test 3 is: ");
		printArray(array3);
		
	}
	
	private static void printArray(int[] array) {
		for(int index : array) {
			System.out.print(index + " ");
		}
		
		System.out.println("\n");
	}
}
