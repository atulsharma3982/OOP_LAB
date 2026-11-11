import hr.HRManager;

public class Main {
    public static void main(String[] args) {
        HRManager h1 = new HRManager("Rahul", 101, 45000, "Computer Science");
        System.out.println("=====EMPLOYEE INFORMATION=====");
        // System.out.println("Employee Name: " + h1.employeeName);
        // System.out.println("Employee ID: " + h1.employeeId);
        // System.out.println("Salary: " + h1.salary);
        System.out.println("Department: " + h1.department);
    }
}
