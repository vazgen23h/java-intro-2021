package arrays1;

import java.util.Scanner;

/*
   task 544: There is given a two dimensional array sized m to n. Compute and print the columns number, 
   that are similar to array's last column. 
   Columns said to be similar, if matching index members are the same.
*/

public class ArrayTask8 {

    public static void main (String [] args) {
    
        System.out.println("Enter array's height: ");
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println("Enter array's width: ");
        scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [][] array = new int [m][n];
        int similarColumns = 0;
        int temp = 0;
        
        System.out.println("Enter array's 1st line elements: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < n; j++) {
                array [i][j] = scanner.nextInt();
            }
            System.out.println();
            if (i == array.length - 1) {
                break;
            }
            System.out.println("next line: ");
        }
        
        for (int j = 0; j < n - 1; j++) {
            temp = 0;
            for (int i = 0; i < array.length; i++){ 
                if (array [i][j] != array [i][n - 1]) {
                    temp = 0;
                    break;
                }
                temp++;
            }
            
            if (temp > 0) {
                similarColumns++;
            }   
        }
        
        System.out.println("Similar columns: " + similarColumns);
    
    }

}
