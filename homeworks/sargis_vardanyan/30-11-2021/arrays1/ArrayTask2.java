package arrays1;

import java.util.Scanner;

/*
   task 480: There is given a two dimensional array, sized m to m,
   where m is a total number. Compute and print auxiliary diagonal's biggest member's line number.
*/

public class ArrayTask2 {

    public static void main(String [] args) {
    
        System.out.println("Enter matrix's length: ");
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int [][] matrix = new int [m][m];
        
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix [i][j] = i + j;
            }
        }
        
        int lineNumber = 0;
        int auxDiagMax = matrix [0][matrix.length - 1];
        for (int i = matrix.length - 1, j = 0;  i >= 1; i--, j++) {
            if (auxDiagMax <= matrix[matrix.length - 1 -i][j]) {
                auxDiagMax = matrix[matrix.length - 1 -i][j];
                lineNumber = matrix.length - 1 - i; 
            }
        }
        
        System.out.println("lineNumber: " + lineNumber); 
    
    }

}




//auxDiagMax <= matrix[matrix.length -1 -i][j] ? matrix[matrix.length -1 -i][j] : auxDiagMax;  



