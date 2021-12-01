package methods;

import java.util.Scanner;

/*
  Task 620.
  Given a total number n and array[n]. Construct a program which will compute and print sum of array's members
  which belong to a given [a, b] range.
*/

public class MethodsTask620 {

	public static void main(String[] args) {
		
		System.out.println("Enter n: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] array = new int[n];
		
		//initializing array.
		System.out.println("Enter array's elements: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		
		System.out.println("Enter a: ");
		int a = scanner.nextInt();
		System.out.println("Enter b: ");
		int b = scanner.nextInt();
		
		System.out.println("sum: " + sumOf(a, b, array));
		
	
	}
	
	//returns sam of array's elements that are in range of [a, b]. 
	static int sumOf(int a, int b, int[] array) {
		int sum = 0;
				
		for (int i = 0; i < array.length; i++) {
			if (a <= array[i] && array[i] <= b) {
				sum += array[i];
			}
		}
		
		return sum;
	}

}
