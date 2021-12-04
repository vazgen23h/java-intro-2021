import java.util.Random;
import java.util.Scanner;

public class Xndir505 {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int[][] array = new int[k][k];
        int[] B = new int[k];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = random.nextInt(30);
            }
        }
        for (int i = 0; i < B.length; i++) {
            B[i] = 1;
        }
        System.out.println("This is the first array!");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println('\n');
        }
        int max = array[0][0];
        int index_I_ForMax = 0;
        int index_J_ForMax = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] >= max) {
                    index_I_ForMax = i;
                    index_J_ForMax = j;
                    max = array[i][j];
                }
            }
            for (int j = 0; j <= index_J_ForMax; j++) {
                B[i] *= array[i][j];
            }
            max = 0;
        }
        System.out.println(" This is array 'B'! ");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
    }
}