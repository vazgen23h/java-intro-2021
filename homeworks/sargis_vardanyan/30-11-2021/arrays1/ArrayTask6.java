package arrays1;

import java.util.Scanner;

/*
   m and n are given natural numbers. Also there are given array with size of m and d number.
   Compute and print two dimensional array with size of m to n which first column is same as given array, 
   and each next column's members are their previous columns members added by d. 
*/

public class ArrayTask6 {

    public static void main (String [] args) {
    
        System.out.println("Enter array's size: ");
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int [] array = new int [m];
        
        System.out.println("Enter newArray's width: ");
        scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [][] newArray = new int [m][n];
        
        System.out.println("Enter d's value: ");
        scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        
        for (int i = 0; i < array.length; i++) {
            array [i] = i*2 + 1;
        }
        
        for (int i = 0; i < newArray.length; i++) {
            newArray [i][0] = array [i];
            for (int j = 1; j < n; j++) {
                newArray [i][j] = newArray [i][j - 1] + d; 
            }
        }
        
        System.out.println();
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < n; j ++) {
                System.out.print(newArray [i][j] + " ");
            }
            System.out.println();
        }
        
        
        
        
        
    
    }

}
