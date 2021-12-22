public class ProgrammersDay {

    public static String dayOfProgrammer(int year) {

        String year1 = Integer.toString(year);
        String a = "12.09.";
        String b = "13.09.";

        if(year >= 1700 && year <= 1917 ) {
            if(year % 4 == 0) {
                return a.concat(year1);
            } else {
                return b.concat(year1);
            }
        } else if(year == 1918) {
            return "26.09.1918";
        } else {
            if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                return a.concat(year1);
            } else {
                return b.concat(year1);
            }
        }
    }
}