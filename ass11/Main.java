import java.util.Scanner;

class Employee {
    private String emp_name;
    private String dept;
    private int emp_id;
    private int salary = 30000;
    private static int id = 5000;

    Employee(String emp_name, String dept) {
        this.emp_name = emp_name;
        this.dept = dept;
        id += 1;
        emp_id = id;
    }
    
    Employee(String emp_name, String dept, int salary) {
        this(emp_name, dept);
        this.salary = salary;
    }
    
    void displayInfo() {
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Department: " + dept);
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Salary: " + salary);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String dept = sc.nextLine();
        Employee e1 = new Employee(name, dept);
        e1.displayInfo();
        name = sc.nextLine();
        dept = sc.nextLine();
        int salary = Integer.parseInt(sc.nextLine());
        Employee e2 = new Employee(name, dept, salary);
        e2.displayInfo();
        sc.close();
    }
}
