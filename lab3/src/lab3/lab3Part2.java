package lab3;

public class lab3Part2 {
	public static void main(String[] args) {
		int num = 3;
		int n = 4;
		System.out.println("The power of " + num + " to the " + n +" power is: " + power(num,n));
	}
	
	public static int power(int x, int n) {
		if (n==0) {
			return 1;
		} else {
			return power(x, n-1) * x;
		}
	}
}
