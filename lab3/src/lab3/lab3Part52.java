package lab3;

public class lab3Part52 {
	public static void main(String[] args) {
		int num = 2;
		int n = 4;
		System.out.println("The power of " + num + " to the " + n +" power is: " + tailRecurPower(num,n, 1));
	}
	
	public static int tailRecurPower(int num, int n, int result) {
		if( n ==0) {
			return result;
		} else {
			return tailRecurPower(num, n - 1, result * num);
		}
	}
}
