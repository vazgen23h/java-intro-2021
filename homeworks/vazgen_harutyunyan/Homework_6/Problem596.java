public class Problem596 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int d = max(a, (a + b), (a - b)) + max(b, (2 * b - a), (b + 2 * a));
        System.out.println(d);
    }
    public static int max(int a, int b, int c) {
        int max = a;
        if(max < b) {
            max = b;
        } else if(max < c) {
            max = c
        }
        return max;
    }
}