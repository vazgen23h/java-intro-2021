package methods;

import java.util.Scanner;

// Task 596.
// y = max(a, a + b, a - b) + max(b, 2b - a, b + 2a).

public class MethodsTask596 {

	public static void main(String [] args) {
		
		System.out.println("a: ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		System.out.println("b: ");
		int b = scanner.nextInt();
		int y = operation(a, b);
		
		System.out.println("y: " + y);
			
	}
	
	//get max from 3 given numbers
	static int max(int a, int b, int c) {
	
		int max;
		
		if (a >= b) {
			if (a >= c) {
				max = a;
			} else {
				max = c;
			}
		} else if (b <= c) {
			max = c;
		} else {
			max = b;
		}
		
		return max;
		
	}
	
	
	static int operation(int a, int b) {
	
		return max(a, a + b, a - b) + max(b, 2*b - a, b + 2*a);
		
	}
	
	

}
