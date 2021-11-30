import java.util.Scanner;
public class Problem277 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 5;
        char[] array = new char[n];
        char[] array2 = new char[n];
        for(int i = 0; i < array.length; i++) {
            array[i] = scanner.next().charAt(0);
        }
        System.out.println("Your first array is");
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        for(int i = 0; i < array.length; i++) {
            if(array[i] == 'd') {
                continue;
            }
            array2[i] = array[i];
        }
        System.out.println("Your last Array is");
        for(int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

    }
}