import java.util.Scanner;
public class Problem616 {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter Array length");
        n = init(n);
        int[] array = new int[n];
        System.out.println("Enter Array");
        init(array);
        System.out.println(average(array));
    }
    public static int init(int a) {
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        return a;
    }
    public static void init(int[] array) {
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
    }
    public static double average(int[] array) {
        double sum = 0;
        int count = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] > 0) {
                sum = sum + array[i];
                count++;
            }
        }
        return(sum / count);
    }
}