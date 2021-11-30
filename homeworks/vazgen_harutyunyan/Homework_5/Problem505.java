import java.util.Scanner;
public class Problem505 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k;
        System.out.println("Enter k");
        k = scanner.nextInt();
        int[][] matrix = new int[k][k];
        for(int i = 0; i < k; i++) {
            for(int j = 0; j < k; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        for(int i = 0; i < k; i++) {
            for(int j = 0; j < k; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println("");
        }
        int[] array = new int[k];
        int number = 1;
        int arrayIndex = 0;
        int max = matrix[0][0];
        int index = 0;
        for(int i = 0; i < k; i++) {
            for(int j = 0; j < k; j++) {
                max = matrix[i][0];
                if(max < matrix[i][j]) {
                    max = matrix[i][j];
                    index = j;
                }
            }
            for(int q = 0; q < index; q++) {
                number = number * matrix[i][q];
            }
            array[arrayIndex] = number;
            arrayIndex++;
            index = 0;
            number = 1;
        }

        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}