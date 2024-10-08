package lab4;

import java.util.*;

public class sorting {
	public static void main(String[] args) {
		int[] array = new int[10];
		setArrayValue(array);
		System.out.println("The original array is: " + Arrays.toString(array));
		
	
		
		long startTime = System.nanoTime();
		int[] arrayCopy1 = array.clone();
		bubbleSort(arrayCopy1);
		long endTime1 = System.nanoTime();
		System.out.println("Sorting using Bubble Sort: " + Arrays.toString(arrayCopy1) + "\nthe time taken is: " + endTime1);
		
		startTime = System.nanoTime();
		int[] arrayCopy2 = array.clone();
		selectionSort(arrayCopy2);
		long endTime2 = System.nanoTime();
		System.out.println("Sorting using Selection Sort: " + Arrays.toString(arrayCopy2)+ "\nthe time taken is: " + endTime2);
		
		startTime = System.nanoTime();
		int[] arrayCopy3 = array.clone();
		insertionSort(arrayCopy3);
		long endTime3 = System.nanoTime();
		System.out.println("Sorting using Insertion Sort: " + Arrays.toString(arrayCopy3)+ "\nthe time taken is: " + endTime3);
		
		startTime = System.nanoTime();
		int[] arrayCopy4 = array.clone();
		improvedBubbleSort(arrayCopy4);
		long endTime4 = System.nanoTime();
		System.out.println("Sorting using improved Bubble Sort: " + Arrays.toString(arrayCopy4)+ "\nthe time taken is: " + endTime4);
	}
	
	public static void setArrayValue(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*50);
		}
	}
	
	public static void bubbleSort(int[] arr) {
		
		int temp;
		
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length - 1 - i; j++) {
				if(arr[j+1] < arr[j]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			
		}
	}
	
	public static void selectionSort(int[] arr) {
		int minIndex;
		int temp;
		
		for(int i = 0; i < arr.length - 1; i++) {
			minIndex = i;
			for(int j = i + 1; j <= arr.length - 1; j++) {
				if(arr[j]< arr[minIndex]) {
					minIndex = j;
				}
			}
			
			temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
	}
	
	public static void insertionSort(int[] arr) {
		int current;
		
		for(int i = 1; i <= arr.length - 1; i++) {
			current = arr[i];
			int j = i;
			while(j>0 && current<arr[j-1]) {
				arr[j] = arr[j-1];
				j--;
			}
			
			arr[j] = current;
		}
	}
	
	public static void improvedBubbleSort(int[] arr) {
		boolean swap;
		int temp;
		
		for(int i = 0; i < arr.length - 1; i++) {
			swap = false;
			for(int j = 0; j< arr.length - 1 - i; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swap = true;
				}
			}
			if(!swap) {
				break;
			}
		}
	}
}
