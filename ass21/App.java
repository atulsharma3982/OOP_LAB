

import result.Result;
import student.Student;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student(sc.nextInt(), sc.next(), sc.nextInt());
        Result r1 = new Result(sc.nextInt(), sc.nextInt(), sc.nextInt());
        sc.close();
        s1.displayInfo();
        r1.displayResult();
    }
}
