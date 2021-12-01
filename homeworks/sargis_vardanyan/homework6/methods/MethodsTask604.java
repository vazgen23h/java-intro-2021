package methods;

import java.util.Scanner;
import java.lang.Math;

// Task 604.
// y = sin(min(x, x + 1, x + y + z)) + cos(min(5, b + c, a)).

public class MethodsTask604 {

	public static void main(String [] args) {
	
		System.out.println("x: ");
		Scanner scanner = new Scanner(System.in);
		double x = scanner.nextDouble();
		System.out.println("y: ");
		double y = scanner.nextDouble();
		System.out.println("z: ");
		double z = scanner.nextDouble();
		System.out.println("a: ");
		double a = scanner.nextDouble();
		System.out.println("b: ");
		double b = scanner.nextDouble();
		System.out.println("c: ");
		double c = scanner.nextDouble();
		
		y = operation(x, y, z, a, b, c);
		System.out.println("y: " + y);
	
	}
	
	//get min form 3 given numbers
	static double min(double x, double y, double z) {
		double min;
		
		if (x > y) {
			if (y < z) {
				min = y;
			} else {
				min = z;
			}
		} else if (x < z) {
			min = x;
		} else {
			min = z;
		}
		
		return min;
	}
	
	static double operation(double x, double y, double z, double a, double b, double c) {
		
		return Math.sin(min(x, x + 1, x + y + z)) + Math.cos(min(5, b + c, a));
		
	}

}
