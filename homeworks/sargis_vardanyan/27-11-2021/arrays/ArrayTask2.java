package arrays;

import java.util.Scanner;

/*
   Compute and print the multiplication of a given n size X and Y arrays member's
   arithmetic means.  
*/

public class ArrayTask2 {

    public static void main(String [] args){
    
        System.out.println("Enter arrays ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] X = new int[n];
        int [] Y = new int[n];
        int sumOfMembersX = 0;
        int sumOfMembersY = 0;
        
        for(int i = 0; i < X.length; i++){
            X[i] = i + 2;
            Y[i] = i + 3;
            
            sumOfMembersX += X[i];
            sumOfMembersY += Y[i]; 
        
          }
         
         System.out.println((sumOfMembersX / X.length) * (sumOfMembersY / Y.length));   
    }
    
}
