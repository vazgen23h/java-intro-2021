import java.util.Scanner;

public class Task171 {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);

		System.out.print("Type a number to calculate a factorial: ");
		long n = console.nextInt();
		long factorial = 1;

		for (long i = 1; i <= n; i++){
			factorial *= i;
		}
		System.out.print(factorial);
	}
}