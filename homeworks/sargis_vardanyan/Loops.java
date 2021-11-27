package sargis_vardanyan;

public class Loops{

    public static void main(String [] args){
    
    int [] array = new int[9];
    
    for(int i = 0; i < array.length; i++){
          array[i] = i;       
       }
    for(int i = 0; i < array.length; i++){
           System.out.println(array.length - i + " ");
       }   
    
    }

}
