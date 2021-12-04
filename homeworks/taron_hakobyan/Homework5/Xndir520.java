import java.util.Random;
import java.util.Scanner;

public class Xndir520 {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("input M!");
        int M = scan.nextInt();
        System.out.println("input N!");
        int N = scan.nextInt();
        System.out.println("input D!");
        int D = scan.nextInt();
        int[] array = new int[M];
        System.out.println("This is te first array!");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
            System.out.print(array[i] + " ");
        }
        int[][] lastArray = new int[M][N];

        for (int i = 0; i < lastArray.length; i++) {
            for (int j = 0; j < lastArray.length; j++) {
                if (j == 0) {
                    lastArray[i][j] = array[i];
                } else {
                    lastArray[i][j] = lastArray[i][j-1] + D;
                }
            }
        }
        System.out.println('\n');
        System.out.println("This is the last array!");
        for (int i = 0; i < lastArray.length; i++) {
            for (int j = 0; j < lastArray.length; j++) {
                System.out.print(lastArray[i][j] + " ");
            }
            System.out.println('\n');
        }
    }
}