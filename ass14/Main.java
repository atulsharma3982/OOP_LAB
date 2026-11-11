class Employee {
    private int employeeID;
    private String name;
    private double salary;

    Employee(int employeeID, String name, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.salary = salary;
    }

    void displayInfo() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

}

class Manager extends Employee {
    private int teamSize;
    private String dept;

    Manager(int employeeID, String name, double salary, int teamSize, String dept) {
        super(employeeID, name, salary);
        this.teamSize = teamSize;
        this.dept = dept;
    }

    @Override 
    void displayInfo() {
        super.displayInfo();
        System.out.println("Team Size: " + teamSize);
        System.out.println("Department: " + dept);
    }
}

public class Main {
    public static void main(String[] args) {
        Manager m1 = new Manager(101, "Rahul", 75000.0, 8, "Software Development");
        System.out.println("-----Manager Details-----");
        m1.displayInfo();
    }
}