
import java.util.Scanner;
public class Problem176{
	public static void main(String[] args){
		int n;
		int a=1;
		int b=1;
		int c=1;
Scanner scanner=new Scanner(System.in);
n=scanner.nextInt();
for(int i=0;i<n;i++){
	a=b;
	b=c;
	c=a+b;
	System.out.println(a);
}
	}
}