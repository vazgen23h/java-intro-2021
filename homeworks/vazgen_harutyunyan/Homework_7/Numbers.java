public class Numbers {
    public static void main(String[] args) {
        digitToWord(1230);


    }




    static String digitToWord(int number) {
        String[] array = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        if(number <= 9) {
            System.out.println(array[number]);
            return array[number];
        } else {
            System.out.println(array[number%10]);
            return digitToWord(number / 10);
        }
    }
}
