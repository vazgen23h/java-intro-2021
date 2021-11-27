package loops;

import java.util.Scanner;

/*
   print multiplication of all natural numbers, division by which 
   the given natural number n's remainder is 3.
*/
public class LoopsTask2{

public static void main(String [] args){

    System.out.println("Give value to n :");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    long result = n - 3;
    
    
    for(long i = 1; i <= n/2; i++){
        if(n % i == 3){
           result *= i;
        }
    }
    
    System.out.println(result);
    
  }

}
