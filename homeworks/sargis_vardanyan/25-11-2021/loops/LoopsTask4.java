package loops;

/*
  Print the biggest 4-digit number, 
  which multiplication with 14 is a square of natural number.
*/
public class LoopsTask4{

public static void main(String [] args){
    
    long result = 0;
    
    for(int i = 9999; i > 1000; i--){
       for(int j = 1; j < i*7; j++){
          if(j*j == i*14){
             result = i;
             break;
          }   
       }
       if(result > 0){
          break;
       }
    }  
    
    System.out.println(result);

  }

}
