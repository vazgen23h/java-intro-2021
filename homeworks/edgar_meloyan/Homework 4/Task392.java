import java.util.Scanner;

public class Task392 {

	public static void main(String[] args) {
		System.out.print("Enter array's size: ");
		Scanner console = new Scanner(System.in);
		int n = console.nextInt();
		int[] arr = new int[n];

		System.out.print("Enter your chars: ");
		console = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			arr[i] = console.nextInt();
		}
		for (int i = 0; i < arr.length / 2; i++) {
			int delete = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = delete;
		}
		System.out.print("Reversed array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "; ");
		}
		System.out.println();
	}
}