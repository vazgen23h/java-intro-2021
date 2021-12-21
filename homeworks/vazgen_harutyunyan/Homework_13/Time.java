public class Time {
    public static void main(String[] args) {
        String a = "12:00:00PM";
        timeConversion(a);
    }

    public static timeConversion(String s) {

        char[] array = s.toCharArray();
        String hours = s.substring(0, 2);
        String result = s.substring(2, array.length - 2);
        String hours2 = "00";
        int numbers = Integer.parseInt(hours);

        if(array[array.length - 2] == 'A') {
            if(numbers == 12) {
                result = hours2 + result;
            } else {
                result = s.substring(0, array.length - 2);
            }
        } else if(array[array.length - 2] == 'P') {
            if(numbers < 12) {
                numbers = numbers + 12;
                result = numbers + result;
            }
            if(numbers == 12) {
                result = numbers + result;
            }
        }
        
        return result;
    }
}




