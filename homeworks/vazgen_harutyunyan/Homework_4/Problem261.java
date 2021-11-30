import java.util.Scanner;
public class Problem261 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length");
        int n;
        double sum1=0;
        double sum2=0;        
        n = scanner.nextInt();
        int[] array1 = new int[n];
        int[] array2 = new int[n];
        System.out.println("Enter first array elements");
        for(int i=0;i<array1.length;i++){
        	array1[i]=scanner.nextInt();
        	sum1=sum1+array1[i];
        }
        System.out.println("Enter second array elements");
        for(int i=0;i<array2.length;i++){
        	array2[i]=scanner.nextInt();
        	sum2=sum2+array2[i];
        }
        sum1=sum1/array1.length;
        sum2=sum2/array2.length;
        System.out.println(sum1*sum2);	

    }
}