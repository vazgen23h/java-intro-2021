import java.util.Scanner;

public class Task529 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter the matrix height: ");
		int m = console.nextInt();

		System.out.print("Enter the matrix weidth: ");
		int n = console.nextInt();

		int[][] matrix = new int[m][n];
		int average = 0;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = i + 2 + j;
				System.out.print(matrix[i][j] + ", ");
			}
			System.out.println();
		}
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 0; j < n; j++) {
				average += matrix[i][j];
			}
		}
		System.out.print("Average: " + (n * matrix.length / 2));
	}
}