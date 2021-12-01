package methods;

import java.util.Scanner;

/*
  Task 616.
  Given a total number n and array[n]. Construct a program, which will compute and print
  positive members arithmetic mean.
*/

public class MethodsTask616 {

	public static void main(String [] args) {
	
		System.out.println("Enter n: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] array = new int [n];
		
		System.out.println("Enter array's members: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		
		System.out.println("Arithmetic mean of array's positive members: " + arithMeanOfPositives(array));
	
	}
	
	//return arithmetic mean of array's positive members.
	static double arithMeanOfPositives (int[] array) {
	
		int sumOfPositives = 0;
		int countOfPositives = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= 0) {
				sumOfPositives += array[i];
				countOfPositives++;
			}
		}
		
		return (double) (sumOfPositives / countOfPositives);
	
	}

}
