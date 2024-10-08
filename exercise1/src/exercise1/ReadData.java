package exercise1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadData {
	public static void main(String[] args) throws Exception{
		java.io.File file = new java.io.File("scores.txt");
		
		Scanner input = new Scanner(file);
		
		while(input.hasNext()) {
			
		try {
			String firstName = input.next();
			System.out.println(firstName);
			String mi = input.next(); 
			System.out.println(mi);
			String lastName = input.next();
			System.out.println(lastName);
			int score = input.nextInt();
			System.out.println(score);
			System.out.println(firstName + " " + mi + " " + lastName + " " + score);

		} catch (InputMismatchException e) {
		    System.out.println("InputMismatchException: Please enter a valid integer.");
		}

		
			
		}
		
		input.close();
	}
}
