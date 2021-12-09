package homework8;

/*
  Write a Java program to find the maximum occurring character in a string.
*/

public class Task5 {

	public static void main(String[] args) {
	
		String str = "Kamikadze";
		System.out.println(maxOccurring(str));
	
	}
	
	
	static char maxOccurring(String str) {
		
		int[] array = new int[256];
		int max = 0;
		char result = ' ';
		
		for (int i = 0; i < str.length(); i++) {
			array[str.charAt(i)]++;
		}
		
		for (int i = 0; i < str.length(); i++) {
			if(max < array[str.charAt(i)]) {
				max = array[str.charAt(i)];
				result = str.charAt(i);
			}
		}
		
		return result;
	
	}

}
