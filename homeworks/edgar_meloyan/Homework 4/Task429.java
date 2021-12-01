import java.util.Scanner;

public class Task429 {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		System.out.print("Enter the matrix size: ");
		int m = console.nextInt();
		int[][] matrix = new int[m][m];
		int solution = 0;

		for (int i = 0; i < matrix.length; i++) {
			matrix[i][0] = i;
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = j;
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = i; j < matrix.length; j++) {
				if(matrix[i][j] % 5 == 2) {
					solution++;
				}
			}
		}
		System.out.print("Solution: " + solution);
	}
}