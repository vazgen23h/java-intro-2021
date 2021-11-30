import java.util.Scanner;

public class Task253 {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		System.out.print("Enter array's size ");
		int n = console.nextInt();
		int minElement = 0;
		int maxElement = 0;
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;

			minElement = arr[0];
			maxElement = arr[0];

			if (minElement >= arr[i]) {
				minElement = arr[i];
			}
			if (maxElement <= arr[i]) {
				maxElement = arr[i];
			}
		}
		System.out.print("Sum of array's min and max elements is: " + (maxElement + minElement));
	}
}