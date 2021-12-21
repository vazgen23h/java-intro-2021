import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter your string: ");
		String str = console.nextLine();
		char[] result = str.toCharArray();
		for (int i = 0; i < result.length; i++){
		System.out.println("Element [" + i + "]: " + result[i]);	
		}
	}
}