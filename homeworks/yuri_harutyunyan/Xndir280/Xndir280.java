import java.util.Scanner;

public class Xndir280{
    public static void main(String args[]){
    	Scanner scanner = new Scanner(System.in);
    	int n = scanner.nextInt();
    	char[] array1 = new char[n];
    	for(int i =0;i<n;i++){
    		if(array1[i] == 'f'){
    			n=++n;
    		}
    	}
		char[] array2 = new char[n];
		for(int i = 0 ; i<n;i++){
			if(array2[i]=='f'){
				array2[i+1]=array2[i];
				i++;
			}
		}
    }
}