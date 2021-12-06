import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        String[] words = digitToWords(number);
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
        System.out.println("If you want to continue press 'Yes'");
        String count = scan.next();
        if (count.equals("Yes")) {
            main(args);
        } else {
            System.out.println("End!");
        }
    }

    static String[] digitToWords(int number) {
        int stringLenght = 0;
        int numberx = number;
        while (number != 0) {
            number /= 10;
            ++stringLenght;
        }
        String[] words = new String[stringLenght];
        for (int i = words.length - 1; i >= 0; i--) {
            words[i] = String.valueOf(numberx % 10);
            numberx /= 10;
        }
        return words;
    }
}