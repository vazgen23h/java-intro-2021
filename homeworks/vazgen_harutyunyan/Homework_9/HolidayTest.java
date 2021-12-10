class Holiday {
    String name;
    int day;
    String month;

    Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }

    boolean inSameMonth(Holiday h) {
        if(this.month.equals(h.month)) {
            return true;
        }
        return false;
    }

    double avgDate(Holiday[] h) {
        double s = 0;
        for(int i = 0; i < h.length; i++) {
            s = s + h[i].day;
        }
        return s / h.length;
    }
}

public class HolidayTest {
    public static void main(String[] args) {
        Holiday h = new Holiday("Independence Day", 4, "July");
        Holiday y=new Holiday("abcd",6,"July");
        System.out.println(y.inSameMonth(h));

    }
}