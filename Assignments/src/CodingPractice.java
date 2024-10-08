import java.util.Scanner;
import java.util.Arrays;

public class CodingPractice {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please provide an integer number for the number of rows: ");
		int n = input.nextInt();
		System.out.println("Please provide an integer number for the number of columns: ");
		int m = input.nextInt();
		
		int[][] matrix = new int[n][m];
		
		for (int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = 10 + (int)(Math.random() * 90);
			}
		}
		System.out.println("Initial Matrix: ");
		printArray(matrix);
		int[][] result = matrixTranspose(matrix);
		System.out.println("Matrix Transpose: ");
		printArray(result);
		
		input.close();
	}
	
	public static void printArray(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
		
	}
	
	public static int[][] matrixTranspose(int[][] matrix) {
		int[][] result = new int[matrix[0].length][matrix.length];
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j< matrix[i].length; j++) {
				result[j][i] = matrix[i][j];
			}
		}
		return result;
	}
	
}
