class Employee {
    String name;
    String yearOfJoining;
    String address;
    String salary;
    Employee(String name, String yearOfJoining, String salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }
}

public class Task2 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Bob", " 1973", " 3000","64C- WallsStreat");
        Employee employee2 = new Employee("John", " 1989", " 4000","64D- WallsStreat");
        Employee employee3 = new Employee("Sam", " 2001", " 5000","64E- WallsStreat");
        System.out.printf("%-20s%-20s%-20s%s", "name", "year of joining", "salary", "address");
        System.out.println();
        System.out.format("%-20s%-20s%-20s%s", employee1.name, employee1.yearOfJoining, employee1.salary, employee1.address);
        System.out.println();
        System.out.format("%-20s%-20s%-20s%s", employee2.name, employee2.yearOfJoining, employee2.salary, employee2.address);
        System.out.println();
        System.out.format("%-20s%-20s%-20s%s", employee3.name, employee3.yearOfJoining, employee3.salary, employee3.address);
    }
}