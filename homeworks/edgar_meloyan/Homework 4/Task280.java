import java.util.Scanner;

public class Task280 {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		System.out.print("Enter array's size: ");

		int addingF = 0;
		int n = console.nextInt();
		char[] arr = new char[n];

		System.out.println("Enter " + n + " chars: ");
		console = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			arr[i] = console.nextLine().charAt(0);
			if (arr[i] == 'f') {
				addingF++;
			}
		}
		char[] newArr = new char[n + addingF];

		for (int i = 0, j = 0; i < arr.length; i++) {
				if (arr[j] == 'f') {
					newArr[i] = arr[j];
					newArr[i + 1] = 'f';
					j++;
					i++;
					continue;
				}
				newArr[i] = arr[j++];
		}
		System.out.print("Array with added f: ");

		 for (char c : newArr) {
            System.out.print(c + ", ");
        }
        System.out.println();
 	}
}