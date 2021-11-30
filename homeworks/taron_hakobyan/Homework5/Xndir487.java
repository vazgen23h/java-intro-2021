import java.util.Random;
import java.util.Scanner;

public class Xndir487 {

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
                /*
                array[i][j] = random.nextInt(30);
                System.out.print(array[i][j] + " ");
                */

            }
            //System.out.println('\n');
        }
        int k = 0;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (j == k) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = 2;
                }
            }
            k++;
        }
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println('\n');
        }
        int numberOfSteps = N;
        for (int i = M - 1; i >= 0; i--) {
            for (int j = 0; j < numberOfSteps - 1; j++) {
                if (array[i][j] != array[j][i]) {
                    System.out.println("Is not simetrical");
                    System.exit(0);
                    return;
                }
            }
            numberOfSteps--;
        }
        System.out.println("array is simetrik!");
    }
}
