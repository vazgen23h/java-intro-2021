import java.util.Scanner;

public class Task620 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter the array's size: ");
		int n = console.nextInt();
		int[] arr = new int[n];

		System.out.print("Enter the array's digits: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = console.nextInt();
		}
		System.out.print("a = ");
		int a = console.nextInt();
		System.out.print("b = ");
		int b = console.nextInt();

		System.out.print("Sum of a and b = " + sum(a, b, arr));
	}
	public static int sum(int a, int b, int[] arr) {
		int sum = 0;

		for(int i = 0; i < arr.length; i++) {
			if (a <= arr[i] && arr[i] <= b) {
				sum += arr[i];
			}
		}
		return sum;
	}
}