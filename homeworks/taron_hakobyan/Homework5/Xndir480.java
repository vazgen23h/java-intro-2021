import java.util.Random;
import java.util.Scanner;

public class Xndir480 {

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
        int newArray[] = new int[n];
        int j = n-1;
        int k = 0;
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[j--][k++];
        }
        System.out.println("AFTER!!!");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }

    }
}