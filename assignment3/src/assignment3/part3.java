package assignment3;

import java.util.Stack;

public class part3 {
	public static boolean isPalindrome(String input) {
		Stack<Character> stack = new Stack<>();
		
		String lowerCase = input.toLowerCase();
		
		for(char c : lowerCase.toCharArray()) {
			if(Character.isLetter(c)) {
				stack.push(c);
			}
		}
		
		for(char c : lowerCase.toCharArray()) {
			if(Character.isLetter(c)) {
				char pop = stack.pop();
				if(pop != c) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		String test1 = "a pa pa pa";
		String test2 = "Hello World";
		
		System.out.println("Is \"" + test1 + "\" a palidrome? " + isPalindrome(test1));
		System.out.println("Is \"" + test2 + "\" a palidrome? " + isPalindrome(test2));
	}
}
