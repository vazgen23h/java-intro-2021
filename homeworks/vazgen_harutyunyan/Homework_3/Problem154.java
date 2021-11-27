import java.util.Scanner;

public class Problem154 {
    public static void main(String[] args) {
        int lastNumber;
        int product = 1;
        int firstNumber=1;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Last number");
        lastNumber = scanner.nextInt();
        System.out.println("Enter n");
        n=scanner.nextInt();
        int[] naturalNumbers = new int[lastNumber];
        for(int i = 0; i < lastNumber; i++) {
            naturalNumbers[i] = firstNumber;
            firstNumber++;
        }
        for(int i = 0; i < naturalNumbers.length; i++) {
        	if(naturalNumbers[i]%n==0){
        		product=product*naturalNumbers[i];
        	}
        }


        /*for(int i = 0; i < naturalNumbers.length; i++) {
            if(naturalNumbers[i] % 3 == 1 || naturalNumbers[i] % 4 == 2) {
                product = product * naturalNumbers[i];
            }*/
        //}
        System.out.println(product);
    }

}