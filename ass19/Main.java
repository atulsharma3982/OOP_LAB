class Person{
    private String name;
    private int age;
    private long contact;

    Person(String name, int age, long contact) {
        this.name = name;
        this.age = age;
        this.contact = contact;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Contact Number: " + contact);
    }
}

class Student extends Person {
    private int rollNo;
    private String course;
    private int semester;

    Student(String name, int age, long contact, int rollNo, String course, int semester) {
        super(name, age, contact);
        this.rollNo = rollNo;
        this.course = course;
        this.semester = semester;
    }
    
    @Override
    void display() {
        super.display();
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Course: " + course);
        System.out.println("Semester: " + semester);
    }
}

class Teacher extends Person {
    private int employeeId;
    private String subject;
    private double salary;

    Teacher(String name, int age, long contact, int employeeId, String subject, double salary) {
        super(name, age, contact);
        this.employeeId = employeeId;
        this.subject = subject;
        this.salary = salary;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Subject: " + subject);
        System.out.println("Salary: Rs. " + salary);
    }
}

interface Researcher {
    void conductResearch();
}

class Professor extends Teacher implements Researcher {

    Professor(String name, int age, long contact, int employeeId, String subject, double salary) {
        super(name, age, contact, employeeId, subject, salary);
    }
    
    @Override
    public void conductResearch() {
        System.out.println("Professor is conducting research");
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Rahul Sharma", 20, 9876543210L, 101, "B.Tech CSE", 4);
        Professor p1 = new Professor("Dr. Ananya Sen", 45, 9123456780L, 501, "Artificial Intelligence", 85000);
        System.out.println("=====STUDENT INFORMATION=====");
        s1.display();
        System.out.println("\n=====PROFESSOR INFORMATION=====");
        p1.display();
        p1.conductResearch();
    }
}