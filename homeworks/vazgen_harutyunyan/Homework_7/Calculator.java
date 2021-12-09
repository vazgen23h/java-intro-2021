public class Calculator {
    public static void main(String[] args) {

        if(args[0].equals("+")) {
            int sum = 0;
            for(String a : args) {
                if(a == args[0]) {
                    continue;
                }
                sum = sum + Integer.parseInt(a);
            }
            System.out.println(sum);
        } else if(args[0].equals("-")) {
            int diff = Integer.parseInt(args[1]);
            for(String a : args) {
                if(a == args[0] || a == args[1]) {
                    continue;
                }
                diff = diff - Integer.parseInt(a);
            }
            System.out.println(diff);
        } else if(args[0].equals("*")) {
            int mult = 1;
            for(String a : args) {
                if(a == args[0]) {
                    continue;
                }
                mult = mult * Integer.parseInt(a);
            }
            System.out.println(mult);
        } else if(args[0].equals("/")) {
            int div = Integer.parseInt(args[1]);
            for(String a : args) {
                if(a == args[0] || a == args[1]) {
                    continue;
                }
                div = div / Integer.parseInt(a);
            }
            System.out.println(div);
        }
    }
}