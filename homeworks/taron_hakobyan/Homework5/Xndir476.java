import java.util.Random;
import java.util.Scanner;

public class Xndir476 {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = random.nextInt(30);
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println('\n');
        }
        int k = scan.nextInt();
        int max = array[k][0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[k][i + 1] > max) {
                max = array[k][i + 1];
            }
        }
        System.out.println(max);

    }
}