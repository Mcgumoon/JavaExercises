package exercise1;

import java.util.Scanner;

public class Quotient {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter two integers: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		try {
			System.out.println(num1 + " / " + num2 + " is " + (num1 / num2));
		} catch(ArithmeticException ex){
			System.out.println("Divisor cannot be zero");
		} finally {
			System.out.println("Thank you for running this program.");
		}
		
		System.out.println("To be continued");
	}
}
