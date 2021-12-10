import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int number = console.nextInt();
		System.out.print("Enter the second number: ");
		int power = console.nextInt();
		System.out.print(powerOfNumber(number, power));
	}


	static int powerOfNumber (int number, int power) {
		int result = 1;
		while(power > 0) {
			result *= number;
			power--;
		}
		return result;
	}
}