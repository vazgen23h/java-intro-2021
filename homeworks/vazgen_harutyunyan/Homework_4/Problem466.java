import java.util.Scanner;
public class Problem466 {
    public static void main(String[] args) {
        int m;
        int s=0;
        System.out.println("Enter array length");
        Scanner scanner = new Scanner(System.in);
        m = scanner.nextInt();
        System.out.println("Enter array elements");
        int[] array2=new int[m];
        int[][] array = new int[m][m];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < m; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println("");
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < m; j++) {
            	if((j+1)==m){
                		break;
                	}
                if(array[i][j]<array[i][j+1]){
                	s++;

                }
            }
            if(s==(m-1)){
            	array2[i]=-3;
            }
            else{
            	array2[i]=3;
            }
            s=0;
        }
        System.out.println("Last arrat is:");
        for(int i=0;i<m;i++){
        	System.out.print(array2[i]+" ");
        }


    }
}