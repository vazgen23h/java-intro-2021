import java.util.Scanner;
public class Problem529 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m;
        int firstRow = 1;
        double sum = 0;
        int countOfOdd = 0;
        System.out.println("Enter array width");
        n = scanner.nextInt();
        System.out.println("Enter array length");
        m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println("");
        }
        for(int i = 1; i < n; i = i + 2) {
            for(int j = 0; j < m; j++) {
                sum = sum + matrix[i][j];

            }
            countOfOdd++;
        }
        System.out.println("Sum is :" + sum / countOfOdd);
    }
}