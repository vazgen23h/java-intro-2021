import java.util.Scanner;
public class Problem154{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 1;
		for(int i = 1;n>i;i++){
			if(n%i==3){
				sum=sum*i;
			}
		}
		System.out.println(sum);

	}
}