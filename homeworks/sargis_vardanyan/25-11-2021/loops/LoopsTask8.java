package loops;

import java.util.Scanner;

/*
  N is a given natural number. Compute and print x1, ..., xN real numbers sequence 
  if x0 = 2 , k = 1, 2, ..., N and xk = 2 + 1/x(k-1).
*/
public class LoopsTask8{

public static void main(String [] args){

    System.out.println("Give value to N :");
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    double array[] = new double[N];
    array[0] = (double)5/2;
    System.out.format("%.2f%n", array[0]);
    
    for(int i = 1; i < array.length; i++){
        array[i] = (double)(2 + 1/array[i - 1]);
        System.out.format("%.5f%n", array[i]);
    }
    

 }

}
