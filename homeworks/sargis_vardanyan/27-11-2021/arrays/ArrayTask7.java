package arrays;

import java.util.Scanner;

/*
   There is given a two dimensional array, sized m to m,
   where m is a total number. Compose B vector's receiving and printing algorithm, 
   which b(i) members are equal to a given i-th line's main and auxiliary diagonals members arithmetic mean.
*/

public class ArrayTask7 {

    public static void main (String [] args) {
    
        System.out.println("Enter matrix's length: ");
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int [][] matrix = new int [m][m];
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix [i][j] = (i + 1) * (matrix.length -1);
            }
        }
             
        int[] B = new int[m];
        
        for (int i = 0, j = 0; i < B.length; i++, j++) {
            B [i] = (matrix[i][j] + matrix[i][matrix.length - 1 - j]) / 2;    
        }
        
        System.out.print("B: ");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + ", ");
        }
        System.out.println();

       
    }

}
