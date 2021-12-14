package homework9;

/*
  The java class called Holiday is started below. An object of class Holiday represents a holiday during the year.
*/

public class TestHoliday {
	
	public static void main(String[] args) {
		Holiday holiday1 = new Holiday();
		Holiday holiday2 = new Holiday("Indepenece Day", 4, "July");
		Holiday holiday3 = new Holiday("Chinese New Year", 12, "February");
		
		System.out.println("holiday1 & holiday2 in same month: " + holiday1.inSameMonth(holiday2));
		System.out.println("average date of holiday1, holiday2, holiday3: " + Holiday.avgDate(holiday1, holiday2, holiday3));	
		
	}

}

class Holiday {

	String name;
	int day;
	String month;
	
	Holiday() {
		name = "unknown";
		day = 0;
		month = "unknown";
	}
	
	Holiday(String name, int day, String month) {
		this.name = name;
		this.day = day;
		this.month = month;		
	}
	
	boolean inSameMonth(Holiday hday) {
		return this.month.equals(hday.month);
	}
	
	static double avgDate(Holiday ... hdays) {
		double result = 0;
		
		for (int i = 0; i < hdays.length; i++) {
			result += hdays[i].day;
		}
		
		return result / hdays.length;
	}
	

}
