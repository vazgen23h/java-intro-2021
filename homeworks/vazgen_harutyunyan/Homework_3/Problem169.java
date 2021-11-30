//Input number x, y, z.
//If the sum of x and y give us prime number return z=5.


import java.util.Scanner;
public class Problem169 {
    public static void main(String[] args) {
        int x;
        int y;
        int isPrimary = 0;
        int sum = 0;
        int z = 5;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        x = scanner.nextInt();
        System.out.println("Enter second number");
        y = scanner.nextInt();
        sum = x + y;
        for(int i = 2; i <= sum / 2; i++) {
            if(sum % i == 0) {
                isPrimary++;
            }
        }
        if(isPrimary == 0) {
            System.out.println(z);
        } else {
            System.out.println(++z);
        }
    }
}