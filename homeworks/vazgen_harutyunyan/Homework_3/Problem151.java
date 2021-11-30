import java.util.Scanner;

public class Problem151{
	public static void main(String[] args){
		int lastNumber; //array.length=lastNumber
		int n;
		int sum=0;
		Scanner scanner=new Scanner(System.in);
			System.out.println("Enter your Last Nuber");
			lastNumber=scanner.nextInt();
			System.out.println("Enter your test number");
			n=scanner.nextInt();

			int[] naturalNumbers =new int[lastNumber];
			for(int i=0;i<naturalNumbers.length;i++){
				naturalNumbers[i]=i;
			}
			for(int i=0;i<naturalNumbers.length;i++){
				if(naturalNumbers%n==0){
					sum=sum+naturalNumbers;
				}

			}
			System.out.println(sum);

		}

	}
