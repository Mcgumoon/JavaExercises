import java.util.Arrays;

public class random2D {
	public static void main(String[] args) {
		
		int[][] matrix = new int[3][3];
		
		System.out.println(Arrays.deepToString(matrix));
		
		for(int row = 0; row < matrix.length; row++) {
			for (int columns = 0; columns < matrix[0].length; columns++) {
				matrix[row][columns] = (int)(Math.random() * 1000);
			}
		}
		
		System.out.println(Arrays.deepToString(matrix));
	}
}
