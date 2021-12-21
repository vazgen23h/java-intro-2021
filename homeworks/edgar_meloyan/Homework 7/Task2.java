import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = console.nextInt();
        System.out.println("is - " + digitsToWords(n));

    }

    static int digitsToWords(int number) {

        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        if (number / 10 > 0) {
            digitsToWords(number / 10);
            System.out.print(words[number % 10] + " ");
        } else if (number / 10 == 0) {
            System.out.print(words[number] + " ");
        }
        return number;
    }

}	
