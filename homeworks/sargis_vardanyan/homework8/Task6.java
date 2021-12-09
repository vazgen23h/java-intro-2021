package homework8;

/*
  Write a Java program to convert a given String to int, long, float and double.
*/

public class Task6 {

	public static void main(String[] args) {
	
		String str = "700";
		
		System.out.println(stringToInt(str));
		System.out.println(stringToLong(str));
		System.out.println(stringToFloat(str));
		System.out.println(stringToDouble(str));
	
	}
	
	
	public static int stringToInt(String str) {
		
		return Integer.parseInt(str);
	}
	
	public static long stringToLong(String str) {
	
		return Long.parseLong(str);
	
	}
	
	
	public static float stringToFloat(String str) {
	
		return Float.parseFloat(str);
	
	}

	public static double stringToDouble(String str) {
	
		return Double.parseDouble(str);
	
	}
}
