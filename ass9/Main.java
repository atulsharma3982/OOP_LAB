import java.util.Scanner;

class Rectangle{
    private int length;
    private int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int area() {
        return length * breadth;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        sc.close();
        Rectangle r1 = new Rectangle(length, breadth);
        int area = r1.area();
        System.out.println(area);
    }
}