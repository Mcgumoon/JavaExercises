import java.util.Scanner;
import java.util.Arrays;


public class input2D {
	public static void main(String[] args) {
		int[][] matrix = new int[3][3];
		System.out.println(Arrays.deepToString(matrix));
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " columns: ");
		
		for (int row = 0; row < matrix.length; row++) {
			for (int columns = 0; columns < matrix[0].length; columns++) {
				matrix[row][columns] = input.nextInt();
			}
		}
		input.close();
		
		System.out.println(Arrays.deepToString(matrix));
	}
	
}
