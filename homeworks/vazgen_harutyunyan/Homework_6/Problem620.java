import java.util.Scanner;
public class Problem620 {
    public static void main(String[] args) {
        
        int firstNumber=0;
        int lastNumber=0;
        System.out.println("Enter first number");
       firstNumber=init(firstNumber);
        System.out.println("Enter last number");
       lastNumber=init(lastNumber);
        System.out.println(sum(firstNumber,lastNumber));
    }
    public static int init(int a){
    	Scanner scanner = new Scanner(System.in);
    	a=scanner.nextInt();
    	return a;
    }
    public static int sum(int a, int b) {
        int sum = 0;
        for(int i = a; i <= b; i++) {
            sum = sum + i;
        }
        return sum;
    }
}