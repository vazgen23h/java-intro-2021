package selectionstatements;

import java.util.Scanner;

/*
  Get digit with the highest value, from a given 3-digit number.
*/
public class IfElseTask4 {

public static void main(String [] args){

System.out.println("Enter a number with 3 digit");
Scanner scanner = new Scanner(System.in);
int number = scanner.nextInt();

int max;
int a = number % 10;
number = number / 10;
int b = number % 10;
number = number /10;
int c = number;
 
if(c >= b) {
 
   if(c >= a){
      max = c;
   } else {
      max = a;     
   }
 } else if(b >= a){
     max = b;
 } else {
     max = a;
 }

System.out.println("max = " + max);

}

}
