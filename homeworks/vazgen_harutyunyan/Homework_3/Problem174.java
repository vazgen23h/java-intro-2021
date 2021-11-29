import java.util.Scanner;
public class Problem174 {
    public static void main(String[] args) {
        double a = 2;
        double b = 2 + (1 / a);
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for(int i = 0; i < n; i++) {
            a = b;
            b = 2 + (1 / a);
            System.out.println(a);
        }
    }
}