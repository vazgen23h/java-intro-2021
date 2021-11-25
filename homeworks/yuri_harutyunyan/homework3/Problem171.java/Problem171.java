import java.util.Scanner;
public class Problem171{
	public static void main(String args[]){
		Scanner sc  = new Scanner(System.in);
		int N = sc.nextInt();
		int sum =1 ;
		for(int i = 1; i<=N; i++){
			sum = sum *i;

		}
	System.out.print(sum);
	}
}