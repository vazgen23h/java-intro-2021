

public class Xndir292{
	public static void main(String args[]){
		int size = args.length;
		int[] array1 = new int[size];
		for(int i = 0 ;i<size;i++){
			array1[i] = Integer.parseInt(args[i]);
		}
		
		int[] array2 = new int[size];
		for(int i = 0; i<size; i++){
			array2[i]=array1[size-1-i];
		}
		System.out.println(java.util.Arrays.toString(array2));
	}

}