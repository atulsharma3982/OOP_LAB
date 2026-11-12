import java.util.Scanner;

class BankAccount{
    private int accNumber;
    private String name;
    private double balance;

    BankAccount(int accNumber, String name, double balance){
        this.accNumber = accNumber;
        this.name = name;
        this.balance = balance;
    }

    public synchronized void deposit(double amount){
        balance+=amount;
    }

    public synchronized void withdraw(String customer,double amount){
        System.out.print(customer + ": ");
        if(balance>=amount){
            balance-=amount;
            System.out.println("Withdrawal successful: " + amount);
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }

    public void displayAccount(){
        System.out.println("Account Number: " + accNumber);
        System.out.println("Account Holder: " + name);
    }

    public void displayBalance(){
        System.out.println("\nFinal Balance: " + balance);
    }
}

class WithDrawal extends Thread{
    String customer;
    BankAccount bankAccount;
    double amount;
    WithDrawal(String customer,BankAccount bankAccount, double amount){
        this.customer = customer;
        this.bankAccount = bankAccount;
        this.amount = amount;
    }

    public void run(){
        // System.out.println(customer+": ");
        bankAccount.withdraw(customer, amount);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c1, c2;
        int accNumber;
        String name;
        double balance;
        System.out.print("Account Number: ");
        accNumber=sc.nextInt();
        System.out.print("Account Holder: ");
        name=sc.next();
        System.out.print("Initial Balance: ");
        balance=sc.nextDouble();
        BankAccount b1 = new BankAccount(accNumber, name, balance);
        System.out.print("Customer-1 Withdrawal: ");
        c1 = sc.nextDouble();
        System.out.print("Customer-2 Withdrawal: ");
        c2 = sc.nextDouble();
        System.out.println();
        WithDrawal customer1 = new WithDrawal("Customer-1",b1, c1);
        WithDrawal customer2 = new WithDrawal("Customer-2",b1, c2);
        b1.displayAccount();
        customer1.start();
        customer2.start();
        try {
            customer1.join();
            customer2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        b1.displayBalance();
        sc.close();
    }
}