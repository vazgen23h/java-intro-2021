import java.util.Scanner;

public class Task277 {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		System.out.print("Enter array's size: ");

		int n = console.nextInt();
		char[] arr = new char[n];
		int redundantD = 0;

		System.out.println("Enter your chars: ");
		console = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			arr[i] = console.nextLine().charAt(0);
			if (arr[i] == 'd') {
				redundantD++;
			}
		}
		char[] newArr = new char[n - redundantD];

		for (int i = 0, j = 0; i < arr.length; i++) {
				if (arr[i] == 'd') {
					continue;
				}
				newArr[j++] = arr[i];
		}
		System.out.print("Array without d: ");

		 for (char c : newArr) {
            System.out.print(c + ", ");
        }
        System.out.println();
 	}
}