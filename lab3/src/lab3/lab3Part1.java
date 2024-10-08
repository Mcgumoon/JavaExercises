package lab3;

public class lab3Part1 {
	public static void main(String[] args) {
		int[] list = {4,3,6,2,8,9,3,2,8,5,1,7,2,8,3,7};
		
		System.out.print("The sum of the array is: "+ sumArr(list,8));
	}
	
	public static int sumArr(int array[], int n) {

		if(n==0) {
			return 0;
		} else {
			return sumArr(array,n-1) + array[n-1];
		}
	}
}
