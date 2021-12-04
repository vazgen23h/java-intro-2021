import java.util.Scanner;

public class Xndir596 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, b, c;
        System.out.println("input 'a'");
        a = scan.nextDouble();
        System.out.println("input 'b'");
        b = scan.nextDouble();
        System.out.println("input 'c'");
        c = scan.nextDouble();
        System.out.println("Result");
        System.out.println(funq(a, b, c));
    }

    static double funq(double a, double b, double c) {
        double max1 = a;
        if (max1 < b + c) {
            max1 = b + c;
        }
        if (max1 < a) {
            max1 = a;
        }
        double max2 = b;
        if (max2 < 2 * b - a) {
            max2 = 2 * b - a;
        }
        if (max2 < b + 2 * a) {
            max2 = b + 2 * a;
        }
        double ard = max1 + max2;
        return ard;
    }
}