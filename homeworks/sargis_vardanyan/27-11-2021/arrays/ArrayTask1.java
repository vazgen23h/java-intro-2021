package arrays;

import java.util.Scanner;

/*
  Compute and print the sum of maximum and minimum members of a given array, with a length of n.
*/

public class ArrayTask1 {

    public static void main(String [] args){
    
        System.out.println("Enter array's length: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] array = new int[n];
        int max = 0;
        int min = 0;
        
        for(int i = 0; i < array.length; i++){
            array[i] = 2 * (i + 1);
            max = array[0];
            min = array[0];
            
            if(max <= array[i]) {
                max = array[i];
            }
            
            if(min >= array[i]){
                min = array[i];   
            }
        
        }
        
        System.out.println(max + min);
    
    }

} 
