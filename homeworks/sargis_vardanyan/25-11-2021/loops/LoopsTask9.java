package loops;

import java.util.Scanner;

/*
  N is a given natural number. Compute and print x1, ..., xN real numbers sequence 
  if x0 = 1,  k = 1, 2, ..., N and xk = (x(k-1) + 1)/k.
*/
public class LoopsTask9{

public static void main(String [] args){

    System.out.println("Give value to N: ");
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    double [] array = new double[N];
    array[0] = 2;
    System.out.format("%.5f%n , ", array[0]);
    
    for(int i = 1; i < array.length; i++){
        array[i] = (array[i - 1] + 1) / i;
        System.out.format("%.5f%n", array[i]);
    
    }
   
   System.out.println();
   

  }

}
