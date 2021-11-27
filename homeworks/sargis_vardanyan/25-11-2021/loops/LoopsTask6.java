package loops;

import java.util.Scanner;

/*
  x and y are natural numbers. Assign 5 to a variable z, if
  (x + y) is a simple number, otherwise assign 6 and print. 
*/
public class LoopsTask6{

public static void main(String [] args){

    System.out.println("Give value to x :");
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    System.out.println("Give value to y :");
    int y = scanner.nextInt();
    int z = 5;
    
    if((x + y) % 2 == 0 && (x + y) != 2){
        z = 6;  
    } else {
        for(int i = 3; i < (x + y) / 2; i += 2){
            if((x + y) % i == 0){
                z = 6;
                break;
            }
        }
    }
    
    System.out.println(z);
    
       

  }

}
