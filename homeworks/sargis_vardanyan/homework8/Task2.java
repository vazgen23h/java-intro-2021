package homework8;

/*
  Write a Java program to compare two strings lexicographically, ignoring case differences.
*/

public class Task2 {

	public static void main(String[] args) {
		
		String s1 = "Vardanyan";
		String s2 = "Sargis";
		System.out.println(compareStrings(s1, s2));
	
	}
	
	//return 0 if equal, return positive if str1 > str2, return negative if str1 < str2
	public static int compareStrings(String str1, String str2) {
		
		return str1.compareToIgnoreCase(str2);
		
	}

}
