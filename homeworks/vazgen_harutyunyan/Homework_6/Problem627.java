import java.util.Scanner;
public class Problem627 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        init(array);
        countOfNegative(array);
        int[] lastArray = negativeArray(array);
        print(lastArray);
    }
    public static void print(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static void init(int[] array) {
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
    }
    public static int countOfNegative(int[] array) {
        int count = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] < 0) {
                count++;
            }
        }
        return count;
    }
    public static int[] negativeArray(int[] array) {
        int index = 0;
        int[] arrayOfIndex = new int[countOfNegative(array)];
        for(int i = 0; i < array.length; i++) {
            if(array[i] < 0) {
                arrayOfIndex[index] = i;
                index++;
            }
        }
        return arrayOfIndex;
    }
}