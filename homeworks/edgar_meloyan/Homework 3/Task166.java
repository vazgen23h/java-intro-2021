import java.util.Scanner;

public class Task166 {
	
	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);

		System.out.print("Enter the n number: ");

		int n = console.nextInt();
		int y = 0;

		while(n % 4 == 0) {
			n = n / 4;
		}
		if(n == 1) {
			y = 1;
		}
		System.out.print(y);
	}
}