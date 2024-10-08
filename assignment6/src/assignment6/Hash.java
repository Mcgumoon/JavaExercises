package assignment6;

import java.util.Random;

public class Hash {
	public static void main(String[] args) {
		Random random = new Random();
		
		int byteIn = Math.abs(Byte.hashCode((byte) random.nextInt()) % 501 );
		int shortIn = Math.abs(Short.hashCode((short) random.nextInt()) % 501 );
		int integerIn = Math.abs(Integer.hashCode(random.nextInt()) % 501 );
		int charIn = Math.abs(Character.hashCode((char) (random.nextInt(26) + 'a')) % 501 );
		int longIn = Math.abs(Long.hashCode(random.nextLong()) % 501 );
		int floatIn = Math.abs(Float.hashCode(random.nextFloat()) % 501 );
		int doubleIn = Math.abs(Double.hashCode(random.nextDouble()) % 501 );
		String randomS = generateRandomString(random,10);
		int stringIndex = Math.abs(randomS.hashCode()%501);
		
		System.out.println("Byte: " + byteIn);
		System.out.println("Short: " + shortIn);
		System.out.println("Integer: " + integerIn);
		System.out.println("Character: " + charIn);
		System.out.println("Long: " + longIn);
		System.out.println("Float: " + floatIn);
		System.out.println("Double: " + doubleIn);
		System.out.println("String: " + stringIndex);
	}
	
	private static String generateRandomString(Random random, int length) {
		StringBuilder sb = new StringBuilder(length);
		for(int index = 0; index < length; index++) {
			sb.append((char)random.nextInt(26) + 'a');
		}
		return sb.toString();
	}
}
