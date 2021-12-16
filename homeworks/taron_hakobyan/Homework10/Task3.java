
class Holiday {
    String name;
    String month;
    int day;

    Holiday(String name, String month, int day) {
        this.name = name;
        this.month = month;
        this.day = day;
    }

    boolean InTheSameMonth(String month2) {
        return this.month.equals(month2);
    }

    double avgDate(Holiday... days) {
        double result = 0;

        for (int i = 0; i < days.length; i++) {
            result += days[i].day;
        }

        return result / days.length;
    }
}

public class Task3 {
    public static void main(String[] args) {
        Holiday Christmas = new Holiday("Christmas", "December", 31);
        Holiday ChineseNewYear = new Holiday("Chinese New Year", "February", 12);
        Holiday IndependanceDay = new Holiday("Indepenece Day", "July", 4);
        System.out.println(Christmas.InTheSameMonth(Christmas.month));
    }
}