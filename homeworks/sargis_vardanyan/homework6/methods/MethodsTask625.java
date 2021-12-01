package methods;

import java.util.Scanner;

/*
  Task 625.
  Given a total number n and array[n]. Construct a program which will compute and print
  the multiplication of array's maximum elements indexes. 	
*/

public class MethodsTask625 {

	public static void main(String[] args) {
	
		System.out.println("Enter n: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] array = new int[n];
		
		//initializing array
		System.out.println("Enter array's elements: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		
		System.out.println("Multiplication of indexes: " + multOfIndexes(array));
	
	}
	
	//returns maximum element's value.
	static int getMax(int[] array) {
		int max = array[0];
		
		for (int i = 0; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}	
		}
		
		return max;
	}
	
	//returns multiplication of array's maximum elements indexes.
	static int multOfIndexes(int[] array) {
		int mult = 1;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == getMax(array)) {
				mult *= i;
			}
		}
		
		return mult;
				
	}

}




