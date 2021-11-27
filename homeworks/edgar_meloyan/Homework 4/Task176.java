import java.util.Scanner;

public class Task176{

	public static void main(String[] args){

		Scanner console = new Scanner(System.in);
		System.out.print("Enter the number of fibonacci numbers: ");
		int n = console.nextInt();
		int f;
		int f1 = 1;
		int f2 = 1;

		System.out.println(f1);
		System.out.println(f2);
		
		for (int i = 0; i < (n - 2); i++) {
			f = f1 + f2;
			f1 = f2;
			f2 = f;
		System.out.println(f);
		}
	}
}