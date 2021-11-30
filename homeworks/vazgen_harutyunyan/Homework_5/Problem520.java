import java.util.Scanner;
public class Problem520 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m;
        int n;
        int number;
        System.out.println("Enter array length");
        m = scanner.nextInt();
        int[] firstArray = new int[m];
        System.out.println("Enter n");
        n = scanner.nextInt();
        System.out.println("Enter number");
        number = scanner.nextInt();
        for(int i = 0; i < firstArray.length; i++) {
            firstArray[i] = scanner.nextInt();
        }
        int[][] matrix = new int[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(i == 0) {
                    matrix[i][j] = firstArray[j];
                } else {
                    matrix[i][j] = firstArray[j] + number;
                    firstArray[j] = firstArray[j] + number;
                }
            }
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println("");
        }
    }
}