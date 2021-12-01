import java.util.Scanner;
public class Problem480 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Enter your matrix length");
        n = scanner.nextInt();
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
        System.out.println("Ojandak ankyunagic");
        int max = matrix[0][n - 1];
        int index = 0;;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if((i + j) == (n - 1)) {
                    if(max < matrix[i][j]) {
                        max = matrix[i][j];
                        index = i;
                    }
                }
            }
        }
        System.out.println(index);
    }
}