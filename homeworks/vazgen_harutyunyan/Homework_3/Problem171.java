//Calculate N!
import java.util.Scanner;
public class Problem171{
    public static void main(String[] args) {
        int n;
        int factorial=1;
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();
        if(n==0){
        	System.out.print(factorial);
        }
        for(int i=1;i<=n;i++){
        	factorial=factorial*i;
        }
        System.out.print(factorial);
    }
}