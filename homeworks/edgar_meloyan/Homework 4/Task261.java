import java.util.Scanner;

public class Task261 {

	public static void main(String[] args) {
 
		Scanner console = new Scanner(System.in);
		System.out.print("Enter size of X & Y: ");

		int n = console.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		int averageOfX = 0;
		int averageOfY = 0;

		for (int i = 0; i < x.length; i++) {
			x[i] = (i + 1) * 2;
			y[i] = i + 1;

			averageOfX += x[i];
			averageOfY += y[i];
		}
		System.out.print((averageOfx / x.length) * (averageOfY / y.length));
	}
}