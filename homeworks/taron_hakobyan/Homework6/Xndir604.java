import java.util.Scanner;

public class Xndir604 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x, y, z, a, b, c;
        System.out.println("input 'x'");
        x = scan.nextDouble();
        System.out.println("input 'y'");
        y = scan.nextDouble();
        System.out.println("input 'z'");
        z = scan.nextDouble();
        System.out.println("input 'a'");
        a = scan.nextDouble();
        System.out.println("input 'b'");
        b = scan.nextDouble();
        System.out.println("input 'c'");
        c = scan.nextDouble();
        System.out.println("Result");
        System.out.println(funq(x, y, z, a, b, c));
    }

    static double funq(double x, double y, double z, double a, double b, double c) {
        //choose min
        double min = 5;
        if (min > b + c) {
            min = b + c;
        }
        if (min > a) {
            min = a;
        }
        //choose max
        double max = x;
        if (max < x + 1) {
            max = x + 1;
        }
        if (min < x + y + z) {
            max = a;
        }
        double ard = Math.sin(max)+Math.cos(min);
        return ard;
    }
}
