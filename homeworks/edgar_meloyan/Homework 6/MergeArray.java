import java.util.Scanner;

public class MergeArray{
	
public static void main(String[] args) {
	int[] arr1 = new int [10];
	int[] arr2 = new int [20];
	initArray(arr1);
	initArray(arr2);
	
	int[] newArr = merge(arr1, arr2);
	for (int i = 0; i < newArr.length; i++) {
		System.out.print(newArr[i] + " ");
	}
	}


	static void initArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
	}


	static int[] merge(int[] leftArray, int[] rightArray) {
		int[] newArr = new int [leftArray.length + rightArray.length];	

		for (int i = 0; i < leftArray.length; i++) {
			newArr[i] = leftArray[i];
		}
		for (int j = 0; j < rightArray.length; j++) {
			newArr[leftArray.length + j] = rightArray[j];
		}
		// for (int i = 0; i < newArr.length; i++) {
		// 	System.out.print(newArr[i] + " ");
		// }
		return newArr;
	}
} 