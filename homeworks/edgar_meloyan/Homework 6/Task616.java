import java.util.Scanner;

public class Task616 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter the array's size: ");
		int n = console.nextInt();
		int[] arr = new int[n];

		System.out.print("Enter array's digits: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = console.nextInt();
		}
		int result = arithmeticMeanOfNumbers(arr);
		System.out.print("Arithmetic mean of Numbers = " + result);
	}


	public static int arithmeticMeanOfNumbers(int[] arr) {
		int numberOfPositives = 0;
		int sumOfPositives = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 0) {
				sumOfPositives += arr[i];
				numberOfPositives++;
			}
		}
		return 	(sumOfPositives / numberOfPositives);
	}
}