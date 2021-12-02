package loops;

import java.util.Scanner;

/*
   Print sum of all natural numbers, that given natural n can be divided without remainder. 
*/

public class LoopsTask1{

public static void main(String [] args){

    System.out.println("Give value to n :");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int result = 0;
    
    for(int i = 1; i < n/2; i++){
        if(n % i == 0){
            result += i;
        }
    }
    
    System.out.println(result);

  }

}
