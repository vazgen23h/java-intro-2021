import java.util.Scanner;
import java.lang.Math;

public class Task604 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("x: ");
		double x = console.nextDouble();
		System.out.print("y: ");
		double y = console.nextDouble();
		System.out.print("z: ");
		double z = console.nextDouble();
		System.out.print("a: ");
		double a = console.nextDouble();
		System.out.print("b: ");
		double b = console.nextDouble();
		System.out.print("c: ");
		double c = console.nextDouble();
		y = expression(x, y, z, a, b, c);
		System.out.print("y: " + y);
	}


	static double min(double x, double y, double z) {
		if (x < y) {
			return x < z ? x : z;
		}else {
			return y < z ? y : z;
		}
	}
	static double expression(double x, double y, double z, double a, double b, double c) {
		 return Math.sin(min(x, x + 1, x + y + z)) + Math.cos(min(5, b + c, a));
	}
}
