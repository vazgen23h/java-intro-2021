package homework9;

/*
  Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named ‘Employee’. 
*/

public class TestEmployee {
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee("Jack", 2012, 7000, "204 St. John’s Road");
		Employee emp2 = new Employee("Tom", 2008, 11000, "99 Station Road");
		Employee emp3 = new Employee("Arthur", 2008, 8000, "92 Park Lane");
		
		System.out.printf("%-20s%-20s%-20s%s", "name", "year of joining", "salary", "address");
		System.out.println();
		Employee.printInfo(emp1, emp2, emp3);
		
		System.out.println("emp1 & emp2 same joining year: " + emp1.inSameYear(emp2));
		System.out.println("emp1, emp2 & emp3 average salary: " + Employee.avgSalary(emp1, emp2, emp3));
		
	}

}

class Employee {
	
	String name;
	int yOfJoining;
	int salary;
	String address;
	
	Employee() {
		name = "unknown";
		yOfJoining = 0;
		salary = 0;
		address = "unknown";
	}
	
	Employee(String name, int yOfJoining, int salary, String address) {
		this.name = name;
		this.yOfJoining = yOfJoining;
		this.salary = salary;
		this.address = address;
	}	
	
	boolean inSameYear(Employee emp) {
		return this.yOfJoining == emp.yOfJoining;
	}
	
	static double avgSalary(Employee ... emps) {
		double result = 0;
		
		for (int i = 0; i < emps.length; i++) {
			result += emps[i].salary;
		}
		
		return result / emps.length;
	}
	
	static void printInfo(Employee ... emps) {
		for (int i = 0; i < emps.length; i++) {
			System.out.printf("%-20s%-20d%-20d%s", emps[i].name, emps[i].yOfJoining, emps[i].salary, emps[i].address);
			System.out.println();
		}
	}
}



