import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float length = sc.nextFloat();
        float width = sc.nextFloat(); 
        sc.close();
        System.out.printf("Perimeter = %.2f Area = %.2f", (2*(length+width)) ,(length*width));
    }
}
