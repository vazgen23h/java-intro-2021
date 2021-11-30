import java.util.Scanner;
public class Problem544 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m;
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
        int[] array2 = new int[n];
        for(int i = 0; i < n; i++) {
            array2[i] = matrix[i][m - 1];
        }

        for(int i = 0; i < n; i++) {
            System.out.println(array2[i]);
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(matrix[j][i]);
            }
            System.out.println(" ");
        }
        int s = 0;
        int count = 0;
        for(int i = 0; i < m-1; i++) {
            for(int k = 0; k < n; k++) {
                for(int j = 0; j < n; j++) {
                    if(matrix[i][j] == array2[k]) {
                        s++;
                    }
                }
            }
            if(s == n) {
                count++;
                s = 0;
            }
        }
        System.out.println(count);
    }
}