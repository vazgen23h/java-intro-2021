import java.util.Scanner;

public class Task596 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("a: ");
		int a = console.nextInt();
		System.out.print("b: ");
		int b = console.nextInt();
		int y = expression(a, b);
		System.out.print("y: " + y);
	}

	
	static int max(int a, int b, int c) {
		if (a >= b) {
			return a > c ? a : c;
		}else {
			return b > c ? b : c;
		}


	}
   	static int expression(int a, int b) {
   		return max(a, a + b, a - b) + max(b, 2 * b - a, b + 2 *a);
   	}	
}