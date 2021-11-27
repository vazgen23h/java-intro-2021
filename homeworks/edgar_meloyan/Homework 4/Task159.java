import java.util.Scanner;

public class Task159{

	public static void main(String[] args){

		Scanner console = new Scanner(System.in);

		long multi = 1;

		for (long i = 100; i < 1000; i += 2){
			if (i % 3 == 1 && i % 4 == 2){
				multi *= i;
			}
		}
		System.out.print(multi);
	}
}