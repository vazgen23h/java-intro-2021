import java.util.Scanner;

public class Task7 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter the number: ");
		Integer i = console.nextInt();
		System.out.println("Number = " + i);
		System.out.println("Hex of " + i + " = " + Integer.toString(i, 16));
	}
}