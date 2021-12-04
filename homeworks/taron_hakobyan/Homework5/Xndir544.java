import java.util.Random;
import java.util.Scanner;

public class Xndir544.java {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("input M!");
        int M = scan.nextInt();
        System.out.println("input N!");
        int N = scan.nextInt();
        int[][] array = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                array[i][j] = random.nextInt(3);
                System.out.print(array[i][j] + " ");
            }
            System.out.println('\n');
        }
        System.out.println('\n');
        int col = 0;
        int same = 0;
        int sameCols = 0;
        for (int j = 0; j < N - 1; j++) {
            for (int i = 0; i < M; i++) {
                if (array[i][col] == array[i][N - 1]) {
                    same++;
                } else {
                    break;
                }
                if (same == M) {
                    sameCols++;
                }
            }
            same = 0;
            col++;
        }
        System.out.println("Number of cols like the last is " + sameCols + "!");
    }
}
