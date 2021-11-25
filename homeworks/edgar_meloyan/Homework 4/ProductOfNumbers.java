import java.util.Scanner;

public class ProductOfNumbers{

	public static void main(String[] args){

		Scanner console = new Scanner(System.in);

		System.out.print("Enter the first number ");
		int num1 = console.nextInt();

		System.out.print("Enter the second number ");
		int num2 = console.nextInt();

		System.out.print("Enter the third number ");
		int num3 = console.nextInt();

		System.out.print("Enter the fourth number ");
		int num4 = console.nextInt();

		System.out.print("Enter the fifth number ");
		int num5 = console.nextInt();

		System.out.print("Enter a natural number ");
		int n = console.nextInt();


		int multiplying = 1;

		int[] arr = {num1, num2, num3, num4, num5};

		for(int i = 0; i <= arr.length - 1; i++){
			
			if(arr[i] > 0 && arr[i] % n == 3){

				multiplying = multiplying * arr[i];
			}

		}
		
		System.out.print(sum);
	}
}