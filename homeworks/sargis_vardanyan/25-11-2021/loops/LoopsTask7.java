package loops;

import java.util.Scanner;

/*
  Compute and print the factorial of a given natural number N.
*/
public class LoopsTask7{

public static void main(String [] args){

    System.out.println("Give value to N :");
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int factorial = 1;
    
    for(int i = 1; i <= N; i++){
        factorial *= i;
    }
    
    System.out.println(factorial);
    
}

}
