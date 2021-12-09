public class Power {
    public static void main(String[] args) {
        System.out.println(power(2, 3));
    }

    static int power(int number, int power) {
        if(power != 0) {
            return number * power(number, power - 1);
        } else {
            return 1;
        }
    }
}
