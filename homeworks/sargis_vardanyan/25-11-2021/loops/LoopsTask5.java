package loops;

import java.util.Scanner;

/*
  Assign 0 to a variable y, if given natural n is not a degree of 4,
  otherwise assign 1 and print.
*/
public class LoopsTask5{

public static void main(String [] args){

    System.out.println("Give value to n :");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int y = 0;
    
    while(n % 4 == 0){
        n /= 4;
    }
    
    if(n == 1){
        y = 1;
    }
    
    System.out.println(y);
    
  }

}
