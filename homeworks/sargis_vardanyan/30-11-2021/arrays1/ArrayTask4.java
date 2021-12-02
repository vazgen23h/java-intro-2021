package arrays1;

import java.util.Scanner;
import java.util.Arrays;

/*
  task 492: There is given a two dimensional array sized m to n,
  which has only one minimum and maximum member
  (where m and n are natural numbers). Make a program which will swap the lines
  containing maximum and minimum members.
   Maximum and minimum members supposed to be located in a different lines. 
*/

public class ArrayTask4 {

    public static void main (String [] args) {
    
        System.out.println("Enter matrix's height: ");
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println("Enter matrix's width: ");
        scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [][] matrix = new int [m][n];
        int max = matrix [0][0];
        int maxLine;
        int min = matrix [0][0];
        int minLine;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix [i][j] = i + j;
                System.out.print(matrix [i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max <= matrix [i][j]) {
                    max = matrix [i][j];
                    maxLine = i;
                }

                if (min >= matrix [i][j]) {
                    min = matrix [i][j];
                    minLine = i;
                }
            }
        }

        int [] newArray = new int[n];
        newArray = matrix [maxLine]; 
        matrix [maxLine] = matrix [minLine]; 
        matrix [minLine] = newArray;

        System.out.println();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix [i][j] + " ");
            }
            System.out.println();
        }    
    
    }
       

}









