   import java.util.Scanner;
  public class homework3{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        boolean t;
        int i = inp.nextInt();
        if (i >= 100 && i < 1000)
            System.out.print("ok: ");
        else
            System.out.print("The number is not valid");
        int a = i / 100;
        int b = i / 10 % 10;
        int c = i % 10;
        if (c == (a + b)) {
            t = true;
        } else
            t = false;
            System.out.print(t);
    }
}
  