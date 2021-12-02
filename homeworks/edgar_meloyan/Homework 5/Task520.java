import java.util.Scanner;

public class Task520 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter the array's size: ");
		int m = console.nextInt();
		int[] arr = new int[m];

		System.out.print("Enter the new array size: ");
		int n = console.nextInt();
		int[][] newArr = new int[m][n];

		System.out.print("Enter the value of d: ");
		int d = console.nextInt();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		for (int i = 0; i < newArr.length; i++) {
			newArr[i][0] = arr[i];
			for (int j = 1; j < n; j++) {
				newArr[i][j] = newArr[i][j - 1] + d;
			}
		}
		System.out.println();
		for (int[] ints : newArr) {
			for (int j = 0; j < n; j++) {
				System.out.print(ints[j] + ", ");
			}
			System.out.println();
		}
	}
}