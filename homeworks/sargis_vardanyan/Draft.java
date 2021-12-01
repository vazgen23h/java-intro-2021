package sargis_vardanyan;

import java.util.Scanner;

public class Draft{

 public static void main (String [] args){
     
     System.out.println("Give n a value: ");
     Scanner scanner = new Scanner(System.in);
     int n = scanner.nextInt();
     int [][] array = new int [n][n];
     int result = 0;
     
     for(int i = 0; i < array.length; i++){
        array [i][0] = i;
        for(int j = i; j < array.length; j++){
            array [i][j] = j;
        
            if(array [i][j] % 2 != 0) {
            result += array[i][j];
          }
        }
     }   
     
     System.out.println(result);
 
 }

}



























