import java.util.Scanner;

class Student{
    private String name;
    private int age;
    private String grade;

    Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: "+grade);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();
        String grade = sc.next();
        sc.close();
        Student s1 = new Student(name, age, grade);
        s1.displayInfo();
    }
}