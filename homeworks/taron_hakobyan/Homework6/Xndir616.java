import java.util.Scanner;

public class Xndir616 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of array(n)");
        int n = scan.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        funq(array);
    }

    static void funq(int[] array) {
        int sum = 0;
        int quan = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sum += array[i];
                quan++;
            }
        }
        sum /= quan;
        System.out.println(sum);
    }

}