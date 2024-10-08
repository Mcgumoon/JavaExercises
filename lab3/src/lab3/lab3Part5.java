package lab3;

public class lab3Part5 {
	public static void main(String[] args) {
		int[] list = {4,3,6,2,8,9,3,2,8,5,1,7,2,8,3,7};
		
		System.out.print("The sum of the array is: "+ tailSumArr(7,list,0));
	}
	
	public static int tailSumArr(int n, int[] arr, int sum) {
		if(n == 0) {
			return sum;
		} else {
			return tailSumArr(n-1, arr, sum + arr[n-1]);
		}
	}
}
