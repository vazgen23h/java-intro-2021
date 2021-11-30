package arrays1;

import java.util.Scanner;

/*
   task 487: There is given a two dimensional array, sized n to n,
   where n is a total number. Compute and print array's positive members sum, if
   array is simmetrical to its main diagonal, otherwise print NO.
*/

public class ArrayTask3 {

    public static void main (String [] args) {
    
        System.out.println("Enter matrix's length: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [][] matrix = new int [n][n];
        int sumOfPositives = 0;
        
        System.out.println("Enter matrix's 1st line elements: ");
        for (int i = 0; i < matrix.length; i++) {
            scanner = new Scanner(System.in);
            for (int j = 0; j < matrix.length; j++) {
                matrix [i][j] = scanner.nextInt();
            }
            System.out.println();
            System.out.println("Next line: ");
            
        }
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix [i][j] + " ");
            }
            System.out.println();
        }
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix [i][j] == matrix[j][i]){
                    if (matrix [i][j] > 0) {
                        sumOfPositives += matrix [i][j];
                    } 
                } else {
                     System.out.println("NO");
                     return;
                }
            }
        }
        
        System.out.println("Sum of positive members: " + sumOfPositives);
        
    
    }

}
