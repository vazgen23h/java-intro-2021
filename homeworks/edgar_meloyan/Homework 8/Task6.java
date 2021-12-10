import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter the string to convert it to integer: ");
		String str1 = console.nextLine();
		int convertToInt = Integer.valueOf(str1);
		System.out.println("Integer value: " + convertToInt + 999);
		
		System.out.print("Enter the string to convert it to double: ");
		String str2 = console.nextLine();
		double convertToDouble = Double.valueOf(str2);
		System.out.println("Double value: " + convertToDouble + 3.14);
		
		System.out.print("Enter the string to convert it to long: ");
		String str3 = console.nextLine();
		long convertToLong = Long.valueOf(str3);
		System.out.println("Long value: " + convertToLong + 999999);

		System.out.print("Enter the string to convert it to float: ");
		String str4 = console.nextLine();
		float convertToFloat = Float.valueOf(str4);
		System.out.print("Float value: " + convertToFloat + 3.14);

	}
}