import java.util.Scanner;
public class Problem492 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int m;
        System.out.println("Enter n");
        n = scanner.nextInt();
        System.out.println("Enter m");
        m = scanner.nextInt();
        int[] array = new int[n];
        int maxIndex = 0;
        int minIndex = 0;
        int[][] matrix = new int[m][n];
        System.out.println("Enter your matrix elements");
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println("");
        }
        int max = matrix[0][0];
        int min = matrix[0][0];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(max < matrix[i][j]) {
                    max = matrix[i][j];
                    maxIndex = i;
                }
                if(min > matrix[i][j]) {
                    min = matrix[i][j];
                    minIndex = i;
                }
            }
        }
        System.out.println("Max = " + max + " index is :" + maxIndex);
        System.out.println("Min = " + min + " index is :" + minIndex);
        for(int j = 0; j < n; j++) {
            array[j] = matrix[maxIndex][j];
            matrix[maxIndex][j] = matrix[minIndex][j];
            matrix[minIndex][j] = array[j];
        }
        System.out.println("Your last matrix is");
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println("");
        }
    }
}