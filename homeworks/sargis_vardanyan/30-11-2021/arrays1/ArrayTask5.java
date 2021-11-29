package arrays1;

import java.util.Scanner;

/*
   There is given a two dimensional array sized n to n.
   Compute a new array, which members are twoDim array's line's members multiplication 
   that are located before the line's biggest member. 
*/

public class ArrayTask5 {

    public static void main (String [] args) {
    
        System.out.println("Enter matrix's size: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [][] array = new int [n][n];
        int [] B = new int [n];

        System.out.println("Enter matrix's 1st line elements: ");
        for (int i = 0; i < array.length; i++) {
            B [i] = 1;
            scanner = new Scanner(System.in);
            for (int j = 0; j < array.length; j++) {
                array [i][j] = scanner.nextInt();
            }
            System.out.println();
            if(i == array.length - 1){
                break;
            }
            System.out.println("next line: ");
        }

        int currentLineMax;
        int currentLineMaxIndex;

        for (int i = 0; i < array.length; i++) {
            currentLineMax = array [i][0];
            currentLineMaxIndex = 0;
            for (int j = 0; j < array.length; j++) {
                if (currentLineMax <= array [i][j]) {
                    currentLineMaxIndex = j;
                }
            }

            if (currentLineMaxIndex == 0){
                B [i] = 0;
                continue;
            }

            for (int k = 0; k < currentLineMaxIndex; k++) {
                B [i] *= array [i][k];
            }

        }

        System.out.print("B: ");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
        System.out.println();   
    
    }

}
