import java.util.Scanner;

public class Cylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double height = sc.nextDouble();
        sc.close();
        System.out.printf("Volume is: %.2f",(Math.PI*Math.pow(radius, 2)*height));
    }
}
