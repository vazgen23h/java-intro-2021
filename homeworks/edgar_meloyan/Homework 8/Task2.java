import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter your first string: ");
		String str1 = console.nextLine();
		System.out.print("Enter your second string: ");
		String str2 = console.nextLine();
		int result = str1.compareToIgnoreCase(str2	);
		System.out.print("Comparison result: " + result);
	}
}