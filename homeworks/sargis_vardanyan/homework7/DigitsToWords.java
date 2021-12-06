package homework7;


public class DigitsToWords {

	public static void main(String[] args) {
		
		digitsToWords(Integer.parseInt(args[0]));
		System.out.println();
		
	}
	
	static void printArray(String[] array) {
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	
	static void digitsToWords(int number) {
		
		final String[] digitNames = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		
		if (number / 10 > 0) {
			digitsToWords(number / 10);
			System.out.print(digitNames[number % 10] + " ");
		} else if (number / 10 == 0) {
			System.out.print(digitNames[number] + " ");
		}
		
	}

}
