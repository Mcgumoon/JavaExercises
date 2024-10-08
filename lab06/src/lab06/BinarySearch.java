package lab06;

public class BinarySearch {
	public static int binary(int[] arr, int target, int left, int right) {
		if (left > right) {
			return -1;
		}
		
		int mid = (left + right) / 2;
		if (arr[mid] == target) {
			return mid;
		} else if (arr[mid] > target) {
			return binary(arr, target,left, mid-1);
		} else {
			return binary(arr, target, mid + 1, right);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		int target = 2;
		
		System.out.println(binary(arr, target,0, arr.length - 1));
	}
}
