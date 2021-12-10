public class Problem1 {
    public static void main(String[] args) {
        String a = reverseString("Hello");
        System.out.println(a);

    }
    static String reverseString(String a) {
        if(a.isEmpty()) {
            return a;
        }
        return reverseString(a.substring(1)) + a.charAt(0);
    }

}