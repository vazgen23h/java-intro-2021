import java.util.Scanner;

public class Homework1{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		double[] x = new double[n];
		double[] y = new double[n];
		double a = 0 ;
		double averageX;
				for(int i = 0 ; i<n; i++){
						a = a +i;
						

				}		
			  averageX = a/n;
			 double  b= 0 ;
			 double averageY;
				for(int i = 0 ; i<n; i++){
						b = b +i;

				}
				averageY =b/n;
				System.out.print(averageY*averageX);
		}
			
	}



