import java.util.Scanner;
public class Problem487{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
        int n;
        int sumOfPositive=0;
        boolean isSymmetric=true;
        System.out.println("Enter your matrix length");
        n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Enter your matrix elements");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println("");
        }
        for(int i=0;i<n;i++){
        	for(int j=0;j<n;j++){
        		if(matrix[i][j]!=matrix[j][i]){
        			isSymmetric=false;
        			break;
        		}else{
        			if(matrix[i][j]>0){
        			sumOfPositive=sumOfPositive+matrix[i][j];
        		}
        		}
        	}
        }
        if(isSymmetric==true){
        System.out.println(sumOfPositive);}
        else{
        	System.out.println("This matrix isn't Symmetric");
        }
	}
}