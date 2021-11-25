import java.util.Scanner;


public class ResultOfSum {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Enter num 1: ");
        int num1 = console.nextInt();
        System.out.println("Enter num 2: ");
        int num2 = console.nextInt();
       
        System.out.println("Enter num 3: ");
        int num3 = console.nextInt();
        
        System.out.println("Enter num 4: ");
        int num4 = console.nextInt();
       
        System.out.println("Enter num 5: ");
        int num5 = console.nextInt();
       
        System.out.println("Natural number: ");
		int n = console.nextInt();
        
        int sum = 0;
        int[] arr = {num1, num2, num3, num4, num5};
        for (int i = 0; i <= arr.length - 1; i++) {

            if (arr[i]>0 && arr[i] % n == 0){
                
                sum += arr[i];
            }

        }
        System.out.println(sum);
    }
}



	}
}