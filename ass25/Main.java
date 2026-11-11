// import java.lang.ArithmeticException;

import java.util.Scanner;

class ATMcashWithDrawal{
    private double balance;

    ATMcashWithDrawal(double balance){
        this.balance = balance;
    }

    public void withdraw(double amount){
        try {
            if(amount%10!=0)
                throw new ArithmeticException("Amount must be a multiple of 10");
            if(amount==0)
                throw new ArithmeticException();
            if(amount<=balance){
                balance-=amount;
                System.out.println("WithDrawal Successful.");
                System.out.println("Remaining Balance: " + balance);
            }else{
                throw new ArithmeticException();
            }
        } catch (ArithmeticException e) {
            System.out.println("Invalid withdrawal amount");
            if(e.getMessage()!=null)System.out.println(e.getMessage());
        } finally {
            System.out.println("ATM transaction completed");
        }
    }
}

public class Main{
    public static void main(String[] args) {
        double balance, amount;
        Scanner sc = new Scanner(System.in);
        System.out.print("Account Balance: ");
        balance = sc.nextDouble();
        System.out.print("WithDrawal Amount: ");
        amount = sc.nextDouble();
        sc.close();
        ATMcashWithDrawal a = new ATMcashWithDrawal(balance);
        a.withdraw(amount);
    }
}