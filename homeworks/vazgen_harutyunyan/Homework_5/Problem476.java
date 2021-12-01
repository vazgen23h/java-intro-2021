import java.util.Scanner;
public class Problem476 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int rowIndex;
        System.out.println("Enter your matrix length");
        n = scanner.nextInt();
        System.out.println("Enter your index of row");
        rowIndex = scanner.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Enter your matrix elements");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println("");
        }
        int max = matrix[0][0];
        if(rowIndex < n && rowIndex >= 0) {
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    if(max < matrix[rowIndex][j]) {
                        max = matrix[rowIndex][j];
                    }
                }
            }
        }
        System.out.println(max);
    }
}