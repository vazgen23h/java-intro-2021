package arrays1;

import java.util.Scanner;

/*
   There is given a two dimensional array sized m to n, where m & n are total numbers.
   Compute and print array's member which is the biggest in its line and the smallest in column 
   if it exists, otherwise print NO.
*/

public class ArrayTask9 {

    public static void main (String [] args) {
    
        System.out.println("Enter array's height: ");
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();

        System.out.println("Enter array's width: ");
        int n = scanner.nextInt();

        int [][] array = new int [m][n];
        int currentLineMax;
        int currentColumnMin;
        int result = 0;

        System.out.println("Enter array's first line elements: ");
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

        for (int i = 0; i < array.length; i++) {
            int indexI = i;
            int column = 0;
            currentLineMax = array [i][0];
            for (int j = 0; j < n; j++) {
                if (currentLineMax <= array [i][j]) {
                    currentLineMax = array [i][j];
                    column = j;
                }
            }

            currentColumnMin = array [i][column];
            for (; i < array.length; i++) {
                if (currentColumnMin >= array [i][column]) {
                    currentColumnMin = array [i][column];
                }
            }


            if (currentColumnMin == currentLineMax) {
                result = currentColumnMin;
                System.out.println("result: " + result);
            }
            i = indexI;

        }
    
    }

}
