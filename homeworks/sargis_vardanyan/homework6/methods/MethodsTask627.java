package methods;

import java.util.Scanner;

/*
  Task 627.
  Given a total number n and array[n]. Construct a program which will compute and print
  a new array, which elements are array[n]'s negative members indexes.
*/

public class MethodsTask627 {

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
		System.out.println();
		
		System.out.print("New array: ");
		printArray(getNewArray(array));
		
		
	
	}
	
	static int countOfNegatives(int[] array) {
		
		int count = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				count++;
			}
		}
		
		return count;
	
	}
	
	//initializing and returning new array which elements are array[n]'s negative members indexes.
	static int[] getNewArray(int[] array) {
		
		int[] newArray = new int[countOfNegatives(array)];
		int index = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				newArray[index] = i;
				index++;
			}
		}
		
		return newArray;	
		
	}
	
	static void printArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}




