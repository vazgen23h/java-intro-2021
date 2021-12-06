import java.util.Scanner;
public class Task1 {

    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            if (args[0].equals("+")) {
                System.out.println(add(args));
            }
            if (args[0].equals("-")) {
                System.out.println(sub(args));
            }
            if (args[0].equals("*")) {
                System.out.println(mult(args));
            }
            if (args[0].equals("/")) {
                System.out.println(dev(args));
            }
            System.out.println("If you want to calculate again press 'Yes'");
            String again = scan.next();
            if (again.equals("Yes")){
                main(args);
            }else{
                System.out.println("End!");
            }
    }

    static double add(String[] args) {
        double sum = Double.valueOf(args[1]);
        for (int i = 2; i < args.length; i++) {
            sum += Double.valueOf(args[i]);
        }
        return sum;
    }

    static double sub(String[] args) {
        double sum = Double.valueOf(args[1]);
        for (int i = 2; i < args.length; i++) {
            sum -= Double.valueOf(args[i]);
        }
        return sum;
    }

    static double mult(String[] args) {
        double sum = Double.valueOf(args[1]);
        for (int i = 2; i < args.length; i++) {
            sum *= Double.valueOf(args[i]);
        }
        return sum;
    }

    static double dev(String[] args) {
        double sum = Double.valueOf(args[1]);
        for (int i = 2; i < args.length; i++) {
            sum /= Double.valueOf(args[i]);
        }
        return sum;
    }
}