import java.util.Scanner;
public class Problem392 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        int n;
        for(int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        for(int i = 0; i < array.length / 2; i++) {
            n = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - i - 1] = n;
        }
        System.out.println("Your last array is :");


        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}