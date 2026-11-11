import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();
        try {
            int result = firstNum/secondNum;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: Cannot divide by zero.");
        } finally {
            sc.close();
            System.out.println("Calculation completed.");
        }
    }
}
