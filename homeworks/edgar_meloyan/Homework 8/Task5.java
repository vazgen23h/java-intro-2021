import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = console.nextLine();
		int[] array = new int[str.length()];
		char maxChar = str.charAt(0);
		char[] convert = str.toCharArray();

		for (int i = 0; i < convert.length; i++) {
			array[i] = 1;
			for (int j = i + 1; j < convert.length; j++) {
				if (convert[i] == convert[j] && convert[i] != ' ' && convert[i] != '0') {
					array[i]++;
					convert[j] = '0';
				}
			}
		}
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				maxChar = convert[i];
				break;
			}
		}
		System.out.print("Maximum occuring character is " + maxChar);
	}
}