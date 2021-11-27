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
            matrix [i][0] = i;
            for (int j = 0; j < matrix.length; j++) {
                matrix [i][0] = j;
            }
        }
             
        int[] B = new int[m];

        for (int k = 0; k < matrix.length; k++) {
            int temp = 0;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length - i; j++) {
                    if (i < j) {
                        temp += matrix[i + j][j];
                    } else if (i + j > matrix.length) {
                        temp += matrix[i - j][j];
                    } else {
                        temp += (matrix[i - j][j] + matrix[i + j][j]);
                    }
                }
            }
            B[k] = temp / (matrix.length + 1);
        }

        System.out.print("B vector: ");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + ", ");
        }
        System.out.println(); 
    }

}
