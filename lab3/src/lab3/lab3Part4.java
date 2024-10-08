package lab3;

public class lab3Part4 {
	public static void main(String[] args) {
		String s = "abcdefghijlkmnop";
		System.out.print("The length of the string is: " + lengthOfString(s,8));
	}
	
	public static int lengthOfString(String word, int n) {
		
		if(n == 0) {
			return 0;
		} else {
			return lengthOfString(word.substring(0,n), n-1) + 1;
		}

	}
}
