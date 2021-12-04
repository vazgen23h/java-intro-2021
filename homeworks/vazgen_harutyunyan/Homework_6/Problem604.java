public class Problem604 {
    public static void main(String[] args) {
        double x = 1;
        double y = 2;
        double z = 1;
        double b = 3;
        double c = 5;
        double a = 9;
        y= Math.sin(min(x, (x + 1), (x + y + z))) + Math.cos(min(5, (b + c), a));
        System.out.println(y);
    }
    public static double min(double a, double b, double c) {
        double min = a;
        if(min > b) {
            min = b;
        } else if(min > c) {
            min = c;
        }
        return min;
    }
}