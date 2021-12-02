import java.util.Scanner;

public class Homework{

	public static void main(String args[]){

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = 0 ;
		int[] array = new int[n];

		for(int i = 0 ; i< array.length; i++){
				array[i] = k++;
			}
				
		int maxValue = array[0];

		for(int i = 0; i < array.length ; i++){
			if(maxValue < array[i]){
				maxValue = array[i];
			}
		}

		int minValue = array[0];

		for(int i = 0; i < array.length; i++){
			if(minValue > array[i]){
				minValue = array[i];
			}
		}

		for(int i = 0 ; i < array.length ; i++){
			System.out.println(array[i]);
			System.out.println(maxValue + minValue);
		}

	}
}