package loops;

/*
  Print multiplication of all 3-digit natural numbers, 
  which division by 3 remainder is 1, 
  and  division by 4 remainder is 2.  
*/
public class LoopsTask3{

public static void main(String [] args){

    long result = 1;
    
    for(long i = 100; i <= 999; i += 2){
       if(i % 3 == 1 && i % 4 == 2){
          result *= i;         
       }
    }
   
    System.out.println(result);
 }

}
