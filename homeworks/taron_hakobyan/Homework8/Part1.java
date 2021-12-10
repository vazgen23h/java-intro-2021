import java.util.Scanner;

public class Part1 {
    public static void main(String[] args) {
        //task2();
        //task3();
        //task4();
        //task5();
        //task6();
        //task7();
    }

    static void task2() {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        boolean bool = str1.equalsIgnoreCase(str2);
        System.out.println(bool);
    }

    static void task3() {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + ", ");
        }
    }

    static void task4() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input first String!");
        String str1 = scan.nextLine();
        System.out.println("Input second String!");
        String str2 = scan.nextLine();
        char[] chars1 = new char[str1.length()];
        for (int i = 0; i < str1.length(); i++) {
            chars1[i] = str1.charAt(i);
        }
        char[] chars2 = new char[str2.length()];
        for (int i = 0; i < str2.length(); i++) {
            chars2[i] = str2.charAt(i);
        }
        int accordance = 0;
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] != chars2[i]) {
                break;
            }
            accordance++;
        }
        if (accordance == str1.length()) {
            System.out.println("Yes!");
        }
    }

    static void task5() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String");
        String str = scan.nextLine();
        char[] chars = new char[str.length()];
        System.out.println('\n');
        for (int i = 0; i < chars.length; i++) {
            chars[i] = str.charAt(i);
            System.out.print(chars[i] + " ");
        }
        int[] quan = new int[chars.length];
        for (int i = 0; i < quan.length; i++) {
            quan[i] = 0;
        }

        for (int i = 0; i < quan.length; i++) {
            for (int j = 0; j < quan.length; j++) {
                if (chars[i] == chars[j]) {
                    quan[i] += 1;
                }
            }
        }
        System.out.println('\n');
        for (int i = 0; i < quan.length; i++) {
            System.out.print(quan[i] + " ");
        }
        int max = quan[0];
        for (int i = 0; i < quan.length - 1; i++) {
            if (quan[i + 1] >= quan[i]) {
                max = quan[i + 1];
            }
        }
        System.out.println('\n');
        System.out.println(max);
        for (int i = 0; i < quan.length; i++) {
            if (quan[i] == max) {
                System.out.println(chars[i]);
                break;
            }
        }
    }

    static void task6() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input String");
        String str = scan.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > '9' || str.charAt(i) < '0') {
                System.out.println("String  includes not only numbers");
                return;
            }
        }
        Integer number1 = Integer.parseInt(str);
        System.out.println("Integer " + number1);
        Double number2 = Double.parseDouble(str);
        System.out.println("Double " + number2);
        Float number3 = Float.parseFloat(str);
        System.out.println("Float " + number3);
    }

    static void task7() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input Integer");
        Integer number = scan.nextInt();
        System.out.println(Integer.toHexString(number));
    }
}