//Calculate the sum of minimal and maximal numbers in array.
import java.util.Scanner;
public class Problem253 {
    public static void main(String[] args) {
        int sum = 0;
        int min;
        int max;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your array length");
        n = scanner.nextInt();
        System.out.println("Enter your array elements");
        int[] array = new int[n];
        for(int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        min = array[0];
        for(int i = 0; i < array.length; i++) {
            if(min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Minimal number is" +" "+ min);
        max = array[0];
        for(int i = 0; i < array.length; i++) {
            if(max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Maximal number is" +" "+ max);
        sum=min+max;
        System.out.println("The sum is"+" "+sum);
    }
}