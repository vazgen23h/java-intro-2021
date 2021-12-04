import java.util.Scanner;

public class Xndir627 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of array(n)");
        int n = scan.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        System.out.println("This is your array!");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println('\n');
        funq(array);
    }

    static void funq(int[] array) {
        int newArraySize = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                newArraySize++;
            }
        }
        int[] newArray = new int[newArraySize];
        int j = 0;
        System.out.println("This is new array!");
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                newArray[j] = array[i];
                System.out.print(newArray[j] + " ");
                j++;
            }
        }
    }
}