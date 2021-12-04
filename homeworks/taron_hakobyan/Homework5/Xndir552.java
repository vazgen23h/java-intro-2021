import java.util.Random;
import java.util.Scanner;

public class Xndir552 {

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
        int maxInRow = array[0][0];
        int minInCol = array[0][0];
        int indexIMax = 0;
        int indexJMax = 0;
        int indexIMin = 0;
        int indexJMin = 0;
        int a = 0;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (array[i][j] >= maxInRow) {
                    maxInRow = array[i][j];
                    indexIMax = i;
                    indexJMax = j;
                }
            }
            System.out.println("max in row " + a + " = " + maxInRow);
            System.out.println("coordinate of max in row = (" + indexIMax + "," + indexJMax + ")");

            maxInRow = 0;
            for (int j = 0; j < M; j++) {
                if (array[j][i] <= minInCol) {
                    minInCol = array[j][i];
                    indexIMin = j;
                    indexJMin = i;
                }
            }
            System.out.println("min in col " + a + " = " + minInCol);
            System.out.println("coordinate of min in col = (" + indexIMin + "," + indexJMin + ")");
            minInCol = 31;
            a++;
            System.out.println('\n');
            if (indexIMax == indexIMin && indexJMax == indexJMin) {
                System.out.println(array[indexIMax][indexJMax]);
            }
        }
    }
}