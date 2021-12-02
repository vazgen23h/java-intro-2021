import java.util.Scanner;

public class Xndir625 {
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
        funq(array);
    }

    static void funq(int[] array) {
        int max = array[0];
        int indexOfMax = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] >= max) {
                max = array[i + 1];
                indexOfMax = i + 1;
            }
        }
        System.out.println("THis is max ->" + max);
        System.out.println("This is index of max ->"+ indexOfMax);
        int numberOfMaximums = 0;
        int sum = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                numberOfMaximums++;
                sum *= i;
            }
        }
        if (numberOfMaximums == 1) {
            System.out.println("There is one max in array");
            return;
        }
        System.out.println("sum = " + sum);
    }
}