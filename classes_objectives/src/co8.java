class Employee {
    private String name;
    private int yearOfJoining;
    private int salary;
    private String address;
    
    public Employee(String name, int yearOfJoining, int salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }
    
    public void printEmployeeInfo() {
        System.out.printf("%-10s %-20s %s\n", name, yearOfJoining, address);
    }
}

public class co8 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        
        employees[0] = new Employee("Robert", 1994, 50000, "64C- WallsStreat");
        employees[1] = new Employee("Sam", 2000, 65000, "68D- WallsStreat");
        employees[2] = new Employee("John", 1999, 45000, "26B- WallsStreat");
        
        System.out.printf("%-10s %-20s %s\n", "Name", "Year of joining", "Address");
        
        for (int i = 0; i < employees.length; i++) {
            employees[i].printEmployeeInfo();
        }
    }
}
