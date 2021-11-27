package arrays;

import java.util.Scanner;

/*
   There is given a two dimensional array, sized m to m,
   with natural number members. Compute and print the count of members,
   which division by 5 remainder is 2 and   
   which are located on the main diagonal and up from it. 
*/

public class ArrayTask6 {

    public static void main (String [] args) {
    
        System.out.println("Enter matrix's length: ");
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int [][] matrix = new int [m][m];
        int result = 0;
        
        for (int i = 0; i < matrix.length; i++) {
            matrix [i][0] = i;
            for (int j = 0; j < matrix.length; j++) {
                matrix [i][j] = j;
            }
        }
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) {
                if (matrix [i][j] % 5 == 2) {
                    result++;
                }
            }
        }
        
        System.out.println("Result: " + result);
        
    
    }

}
