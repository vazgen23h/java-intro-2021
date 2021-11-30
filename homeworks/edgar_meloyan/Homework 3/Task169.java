import java.util.Scanner;

public class Task169 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Enter the x: ");
        int x = console.nextInt();
        System.out.println("Enter the y: ");
        int y = console.nextInt();
        int z = 5;
        boolean isNatural = true;


        for (int i = 2; i < (x + y); i++) {
            if((x + y) % i == 0){
                isNatural = false;
                System.out.println("Z = " + (z = 6));
                break;
            }
        }
        if (isNatural) {
            System.out.println("Z = " + z);
        }
    }
}