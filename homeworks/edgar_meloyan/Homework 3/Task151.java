import java.util.Scanner;


public class Task151 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
		System.out.print("Enter the natural number: ");
		
		int n = console.nextInt();
        int sum = 0;

        for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
                sum += i;
            }

        }
        System.out.println(sum);
    }
}


