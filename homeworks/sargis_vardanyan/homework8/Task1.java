package homework8;

/*
  Task 1: Write a program to reverse String in Java using Recursion? (hint: substring() method can be used)
*/

public class Task1 {

	public static void main(String[] args) {
	
		String word = "Birmingham";
		printReverseString(word);
	
	}
	
	static void printReverseString(String str) {
		
		if (str.length() == 1) {
			System.out.println(str.substring(0, str.length()));
			return;
		}
		
		System.out.print(str.substring(str.length() - 1, str.length()));
		printReverseString(str.substring(0, str.length() - 1));

	}

}





















