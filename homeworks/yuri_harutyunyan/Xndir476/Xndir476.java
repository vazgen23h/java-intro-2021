import java.util.Scanner;
public class Xndir476{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int n =  scanner.nextInt();
		int k ;
		
		int maxNum=0;

		int[][] matrix = new int[n][n];
		for(  k = 3;k < n; ){
			for(int j = 0;j <= n-2; j++){
				if(matrix[k][j]<matrix[k][j+1]){
					maxNum=matrix[k][j+1];
				}
			}
		}
			System.out.print(maxNum);
	}
}