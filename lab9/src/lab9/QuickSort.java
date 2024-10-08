package lab9;

public class QuickSort {
	public static void quickSort(int[] array, int low, int high) {
		if(low < high) {
			int pivot = partition(array, low, high);
			quickSort(array, low, pivot - 1);
			quickSort(array, pivot + 1, high);
		}
	}
	
	private static int partition(int[] array, int low, int high) {
		int pivot = array[high];
		int index = low - 1;
		
		for(int element = low; element < high; element++) {
			if(array[element] < pivot) {
				index++;
				swap(array, index, element);
			}
		}
		
		swap(array, index + 1, high);
		return index + 1;
	}
	
	private static void swap(int[] array, int index, int element) {
		int temp = array[index];
		array[index] = array[element];
		array[element] = temp;
	}
	
	private static void printArray(int[] array) {
		for(int i : array) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n");
	}
	
	public static void main(String[] args) {
		int[] array = {30, 20, 40, 16, 23};
		System.out.println("Original Array is for the first test: ");
		printArray(array);
		
		quickSort(array, 0, array.length - 1);
		System.out.println("The sorted Array is for the first test: ");
		printArray(array);
		
		int[] array2 = {20, 30, 1, 4, 10, 15};
		System.out.println("Original Array is for the second test: ");
		printArray(array2);
		
		quickSort(array2, 0, array2.length - 1);
		System.out.println("The sorted Array is for the second test: ");
		printArray(array2);
		
		int[] array3 = {100, 20, 10, 50, 70};
		System.out.println("Original Array is for the third test: ");
		printArray(array3);
		
		quickSort(array3, 0, array3.length - 1);
		System.out.println("The sorted Array is for the third test: ");
		printArray(array3);
		
		
	}
}
