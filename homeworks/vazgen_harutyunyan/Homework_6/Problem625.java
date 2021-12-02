import java.util.Scanner;
public class Problem625 {
    public static void main(String[] args) {
        int[] array = new int[5];
        init(array);
        System.out.println(sumOfIndex(array));
    }
    public static void init(int[] array) {
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
    }
    public static int sumOfIndex(int[] array) {
        int sum = 1;
        int max = array[0];
        for(int i = 0; i < array.length; i++) {
            if(max < array[i]) {
                max = array[i];
            }
        }
        for(int i = 0; i < array.length; i++) {
            if(max == array[i]) {
                sum = sum * i;
            }
        }
        return sum;
    }
}