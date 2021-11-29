package arrays1;

import java.util.Scanner;

/*
  There is given a two dimensional array sized by m to n. Without using (if) operator 
  compute and print array's odd lines members arithmetic mean.
*/

public class ArrayTask7 {

    public static void main (String [] args) {
    
        System.out.println("Enter array's height: ");
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        
        System.out.println("Enter array's width: ");
        scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int [][] array = new int [m][n];
        int sum = 0;
        
        for (int i = 0; i < array.length; i++) {
            for(int j = 0; j < n; j++) {
                array [i][j] = i + 2 * j;
                System.out.print(array [i][j] + " "); 
            }
            System.out.println();
        }
        
        for (int i = 1; i < array.length; i += 2) {
            for (int j = 0; j < n; j++) {
                sum += array[i][j];
            }
        }   
        
        System.out.println("result: " + (n * array.length / 2));     
       
    
    }

}





