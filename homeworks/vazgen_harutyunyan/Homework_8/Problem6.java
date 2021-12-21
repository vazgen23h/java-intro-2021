public class Problem6 {
    public static void main(String[] args) {
        String int1 = new String();
        int1 = "1234";
        int number1 = Integer.parseInt(int1);
        System.out.println(++number1);

        String double1 = new String();
        double1 = "123.5";
        double number2 = Double.parseDouble(double1);
        System.out.println(number2);

        String float1 = new String();
        float1 = "1.12345";
        float number3 = Float.parseFloat(float1);
        System.out.println(number3);
    }
}