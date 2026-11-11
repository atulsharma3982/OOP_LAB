package student;

public class Student {
    private final int studentId;
    private final String studentName;
    private final int rollNo;

    public Student(int studentId, String studentName, int rollNo) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.rollNo = rollNo;
    }
    
    public void displayInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Roll Number: " + rollNo);
    }
}