import java.util.Scanner;

class Student{
    private String name;
    private int age;
    private String grade;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        if(grade!=null) System.out.println("Grade: "+grade);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Student 1
        String name = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());

        Student s1 = new Student(name, age);
        s1.displayInfo();

        // Student 2
        name = sc.nextLine();
        age = Integer.parseInt(sc.nextLine());
        String grade = sc.nextLine();

        Student s2 = new Student(name, age, grade);
        s2.displayInfo();

        sc.close();
    }
}