class Employee {
    String name;
    int yearOfJoining;
    int salary;
    String address;

    Employee(String name, int yearOfJoining, int salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }
    String getName() {
        return name;
    }
    int getYearOfJoining() {
        return yearOfJoining;
    }
    int getSalary() {
        return salary;
    }
    String getAddress() {
        return address;
    }
    void tablePrint() {
        // How can I print this line only one time for all instances of Employee
        //System.out.printf("%s %20s %10s %20s", "Name", "Year of joining", "Salary", "Address");
        System.out.println();
        System.out.printf("%s %20d %10d %20s", getName(), getYearOfJoining(), getSalary(), getAddress());
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John", 2010, 2500, "Kester ave");
        Employee emp2 = new Employee("Bean", 2002, 12000, "Woodman ave");
        System.out.printf("%s %20s %10s %20s", "Name", "Year of joining", "Salary", "Address");
        emp1.tablePrint();
        emp2.tablePrint();
    }
}