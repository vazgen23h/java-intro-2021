package homework8;

/*
  Write a Java program to convert decimal to hex representation.
*/

public class Task7 {

	public static void main(String[] args) {
	
		int n = 1001;
		System.out.println("dec " + n + " | hex " + decToHex(n));
	
	}
	
	
	public static String decToHex(int n) {
	
		return Integer.toHexString(n);
	
	}

}
