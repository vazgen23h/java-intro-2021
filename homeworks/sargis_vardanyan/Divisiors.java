package sargis_vardanyan;

import java.util.Scanner;

public class Divisiors {

 public static void main (String [] args){
     
     System.out.println("Give N a value: ");
     Scanner scanner = new Scanner(System.in);
     int N = scanner.nextInt();
     int i = 1;
     
     while (i < N/2){
         i++;
         if(N % i != 0){
            continue;
         }
         System.out.print(i + ", ");
     }
     
 
 }

}
