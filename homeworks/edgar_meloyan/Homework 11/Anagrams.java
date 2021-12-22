import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String a = console.nextLine();
        System.out.print("Enter the second string: ");
        String b = console.nextLine();
        boolean result = isAnagram(a,b);
        if (result) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }

    static boolean isAnagram(String a, String b) {
        if ((1 <= a.length() && b.length() <= 50) && a.length() == b.length()) {
            char[] c1 = a.toCharArray();
            char[] c2 = b.toCharArray();

            Arrays.sort(c1);
            Arrays.sort(c2);

            for (int i = 0; i < c1.length; i++) {
                if (c1[i] != c2[i]) return false;
            }
         return true;
        } else return false;
    }
}