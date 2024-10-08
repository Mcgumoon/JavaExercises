import java.util.Arrays;

public class random2Db {
	public static void main(String[] args) {
		int[][] matrix = {
				{2, 5, 9},
				{5, 8, 5},
				{9, 6, 7}
		};
		
		for(int row = 0; row < matrix.length; row++) {
			for(int columns = 0; columns < matrix[0].length; columns++) {
				System.out.print(matrix[row][columns] + " | ");
			}
			
			System.out.println();
		}
		
		System.out.println(Arrays.deepToString(matrix));
		
		for(int[] arr : matrix) {
			for(int element : arr) {
				System.out.print(element + " | ");
			}
			
			System.out.println();
		}
	}
}
