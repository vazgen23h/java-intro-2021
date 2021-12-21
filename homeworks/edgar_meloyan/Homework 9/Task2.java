public class Task2 {
	public static void main(String[] args) {
		Employee sam = new Employee("Sam", 2010, 3600, "East Street");
		Employee katy = new Employee("Katy", 2007, 5000, "Tunlaw Road");
		Employee david = new Employee("David", 2015, 2500, "Constitution Ave.");
		System.out.printf("%s %20s %10s %20s", "Name", "Year of joining", "Salary", "Address");
		sam.tablePrint();
		katy.tablePrint();
		david.tablePrint();
	}
}

class Employee {
	String name;
	String adress;
	int yearOfJoining;
	int salary;

	Employee(String name, int yearOfJoining, int salary, String adress) {
		this.name = name;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
		this.adress = adress;
	}
	
	void tablePrint() {
		System.out.println();
		System.out.printf("%s %20d %10d %20s", name, yearOfJoining, salary, adress);
	}
}