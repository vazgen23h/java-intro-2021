package arrays;

import java.util.Scanner;

/*
   There is given an array with the size of n.
   Without any additional array, reverse the members f a given array. 
*/

public class ArrayTask5 {

    public static void main (String [] args) {
    
        System.out.println("Enter array's size");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] array = new int [n];
        System.out.println("Enter " + n + " numbers: ");
        scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length -1 - i];
            array[array.length - 1 - i] = temp;
        }

        System.out.print("Reversed array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
        
    
    }

}

