import java.util.Random;
import java.util.Scanner;

public class Xndir492 {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int[][] array = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = random.nextInt(30);
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println('\n');
        }
        // checking max and min from array
        int max = array[0][0];
        int min = array[0][0];
        //this local variables are for the  creating the last array (see in line 63)
        int localVal1 = 0;
        int localVal2 = 0;
        //
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i][j] >= max) {
                    max = array[i][j];
                }
                if (array[i][j] <= min) {
                    min = array[i][j];
                }
                //checking [i] for max and min
                if (i == m - 1 && j == n - 1) {
                    System.out.println("max = " + max);
                    System.out.println("min = " + min);
                    int K = 0;
                    for (int k = 0; k < m; k++) {
                        for (int l = 0; l < n; l++) {
                            if (array[k][l] == min) {
                                System.out.println("INDEX_I for min = " + k);
                                localVal1 = k;
                            }
                            K = k;
                            if (array[k][l] == max) {
                                System.out.println("INDEX_I for max = " + K);
                                localVal2 = K;
                            }
                        }
                    }
                }
            }
        }
        //creating the last array
        for (int i = 0; i < n; i++) {
            int term = array[localVal1][i];
            array[localVal1][i] = array[localVal2][i];
            array[localVal2][i] = term;
        }
        //print the last array
        System.out.println("AFTER all");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println('\n');
        }
    }
}