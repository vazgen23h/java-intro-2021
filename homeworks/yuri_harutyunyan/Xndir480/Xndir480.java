import java.util.Scanner;
public class Xndir480{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int iOfMax;
		int[][] matrix = new int[n][n];
		for(int i =0 ; i <= n-2; i++){
			for(int j = 0 ;j<= n-1; j++){
				if(i+j==n-1){
					iOfMax=matrix[i][j];
					if(matrix[i][j]<matrix[i+1][n-j]){
						matrix[i][j]=matrix[i+1][n-j];
					}
				System.out.print(matrix[i][j]);
				}
				}
			}
	
		}
	
	}

