package emp;

public class Employee{
    private String employeeName;
    int employeeId;
    protected double salary;
    public String department;

    public Employee(String employeeName, int employeeId, double salary, String department) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.salary = salary;
        this.department = department;
    }

    
}