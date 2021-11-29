package arrays1;

import java.util.Scanner;

/*
   There is given a two dimensional array, sized m to m,
   where m is a total number. Compute and print line k's maximum member.
*/

public class ArrayTask1 {

    public static void main(String [] args){
    
        System.out.println("Enter matrix's length: ");
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int [][] matrix = new int [m][m];
        
        System.out.println("matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix [i][j] = 2 * (i + j);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        
        System.out.println("Enter line's number: ");
        scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int max = matrix[k][0];
        
        for (int j = 1; j < matrix.length; j++) {
            if (max < matrix[k][j]) {
                max = matrix[k][j];
            }
        }        
            
        System.out.println("max: " + max);
    
    
    }

}
