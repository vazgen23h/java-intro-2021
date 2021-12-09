package homework8;

/*
  Write a Java program to get the contents of a given string as a character array.
*/

public class Task3 {

	public static void main(String[] args) {
		
		String str = "String";
		printArray(charArray(str));
		
	}
	
	
	public static char[] charArray(String str) {
		
		return str.toCharArray();	
		
	}
	
	public static void printArray(char[] array) {
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	} 
	
	

}
