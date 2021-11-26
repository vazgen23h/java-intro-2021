import java.util.Scanner;

public class Problem451 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m;
        double sum1 = 0;
        double sum2 = 0;
        System.out.println("Enter array length");
        m = scanner.nextInt();
        int[][] array = new int[m][m];
        System.out.println("Enter array elements");
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < m; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < m; j++) {
                if(i == j) {
                    sum1 = sum1 + array[i][j];
                }
            }
        }
        System.out.println("First sum is :" + sum1);
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < m; j++) {
                if((i + j) == m - 1) {
                    sum2 = sum2 + array[i][j];
                }
            }
        }
        System.out.println("Second sum is " + sum2);
        sum1 = sum1 / m;
        sum2 = sum2 / m;
        double[] array2 = new double[2];
        array2[0] = sum1;
        array2[1] = sum2;
        System.out.println("1D Array");
        for(int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }
}