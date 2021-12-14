public class Task3 {
	public static void main(String[] args) {
		Holiday h = new Holiday("Independance day", 4, "July");
		Holiday g = new Holiday("Halloween", 31, "October");
		System.out.print(g.sameMonths(h));
	}
}

class Holiday {
	String name;
	int day;
	String month;

	Holiday(String name, int day, String month) {
		this.name = name;
		this.day = day;
		this.month = month;
	}

	boolean sameMonths(Holiday h) {
    	return this.month.equals(h.month);	
	}
}
