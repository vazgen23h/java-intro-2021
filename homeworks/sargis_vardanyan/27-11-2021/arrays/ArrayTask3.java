package arrays;

import java.util.Scanner;

/*
   characters is an array of chars with the size of n.
   Task: Make an array which members are the same as characters without 'd'.
*/

public class ArrayTask3 {

    public static void main(String [] args){
    
        System.out.println("Enter Characters's size: ");
        Scanner scanner = new Scanner(System.in);        
        int n = scanner.nextInt();
        char [] characters = new char[n];
        System.out.println("Enter " + n + " chars: ");
        scanner = new Scanner(System.in);
               
        int countOfD = 0;
        
        for (int i = 0; i < characters.length; i++) {
            characters[i] = scanner.nextLine().charAt(0);
            if (characters[i] == 'd') {
               countOfD++;
            }
         }
        
        char [] newArray = new char[n - countOfD];
        
        for (int i = 0, j = 0; i < characters.length; i++){
            if (characters[i] == 'd'){
                continue;                
            }
            
            newArray[j++] = characters[i];
        }
        
        System.out.print("newArray: ");
        
        for (int i = 0; i < newArray.length; i++){
            System.out.print(newArray[i] + ", ");
        }
        System.out.println();    
    }

}









