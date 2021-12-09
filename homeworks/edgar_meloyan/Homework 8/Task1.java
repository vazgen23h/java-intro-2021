import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter the string yow want to reverse: ");
		String str = console.nextLine();
		System.out.print("The reversed string is: " + reverseString(str));
	}


	static String reverseString(String str) {
		if (str.isEmpty()) {
			return str;
		}
		return reverseString(str.substring(1)) + str.charAt(0);
	}
}