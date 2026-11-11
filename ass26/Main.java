import java.util.Scanner;

class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String msg){
        super(msg);
    }
}

class BankAccManagementSystem{
    private int accNumber;
    private String name;
    private double balance;

    BankAccManagementSystem(int accNumber, String name, double balance){
        this.accNumber = accNumber;
        this.name = name;
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException{
        if(amount<=balance){
            balance-=amount;
        } else {
            throw new InsufficientBalanceException("Transaction Failed: Insufficient balance");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = sc.nextDouble();
        BankAccManagementSystem acc = new BankAccManagementSystem(1524, "Rahul", balance);
        try {
            double amount = sc.nextDouble();
            acc.withdraw(amount);
            System.out.println("WithDrawal Successful");
            System.out.println("Remaining balance: " + acc.getBalance());
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
            System.out.println("Available balance: "+ acc.getBalance());
        } finally {
            System.out.println("Transaction Completed.");
            sc.close();
        }
    }
}
