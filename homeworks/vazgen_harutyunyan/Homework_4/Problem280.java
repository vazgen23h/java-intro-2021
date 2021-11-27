import java.util.Scanner;
public class Problem280 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 5;
        char[] array1 = new char[n];
        int quantityOfF = 0;
        for(int i = 0; i < array1.length; i++) {
            array1[i] = scanner.next().charAt(0);
        }
        System.out.println("Your first array is");
        for(int i = 0; i < array1.length; i++) {
            System.out.println(array1[i] + " ");
        }
        for(int i = 0; i < array1.length; i++) {
            if(array1[i] == 'f') {
                quantityOfF++;
            }
        }
        char[] array2 = new char[n + quantityOfF];
        int secondArrayIndex = 0;
        for(int i = 0; i < array1.length; i++) {
            array2[secondArrayIndex++] = array1[i];
            if(array1[i] == 'f') {
                array2[secondArrayIndex++] = 'f';
            }
        }
        System.out.println("Your last array is");
        for(int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
    }
}
