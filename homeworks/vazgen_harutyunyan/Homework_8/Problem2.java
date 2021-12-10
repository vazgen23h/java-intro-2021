import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1;
        String s2;
        s1 = scanner.nextLine();
        s2 = scanner.nextLine();
        if(s1.equals(s2)) {
            System.out.println("equals");
        } else {
            System.out.println("Different");
        }

    }
}