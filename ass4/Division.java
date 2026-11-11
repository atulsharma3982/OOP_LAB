import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividand = sc.nextInt();
        int divisor = sc.nextInt();
        sc.close();
        System.out.println("The Quotient is = " + dividand/divisor);
        System.out.println("The Remainder is = " + dividand%divisor);
    }    
}
