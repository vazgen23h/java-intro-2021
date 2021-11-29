import java.util.Random;
import java.util.Scanner;

public class Xndir529 {

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
                array[i][j] = random.nextInt(30);
                System.out.print(array[i][j] + " ");
            }
            System.out.println('\n');
        }
        System.out.println('\n');
        System.out.println('\n');
        System.out.println('\n');
        for (int i = 1; i < M; i = i + 2) {
            double sum = 0;
            for (int j = 0; j < N; j++) {
                sum += array[i][j];
            }
            sum /= N;
            System.out.println(sum);
        }
    }
}
