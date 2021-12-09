package homework8;

/*
  Write a Java program to check whether a given string starts with the contents of another string.
*/

public class Task4 {

	public static void main(String[] args) {
		
		String str1 = "Write java";
		String str2 = "program to check";
		System.out.println(ifStartsWithContent(str1, str2));
		
	
	}
	
	
	public static boolean ifStartsWithContent(String str1, String str2) {
	
		if (str1.startsWith(str2)) {
			return true;
		}
		
		return false;
	
	}

}
