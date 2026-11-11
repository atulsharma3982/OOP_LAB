import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int revnum = 0;
        while (num != 0) {
            revnum = revnum * 10 + num % 10;
            num /= 10;
        }
        System.out.println("Reverse = " + revnum);
    }
}
