// package app;

import java.util.Scanner;
import bank.Account;
import customer.Customer;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Customer ID: ");
        int customerID = sc.nextInt();
        System.out.println("Customer Name");
        String customerName = sc.next();
        System.out.println("Phone: ");
        Long phone = sc.nextLong();
        System.out.println("Initial Balance: ");
        double initialBalance = sc.nextDouble();
        Customer c1 = new Customer(customerID, customerName, phone);
        Account a1 = new Account(customerID, initialBalance);
        double deposit, withdraw;
        c1.display();
        System.out.println("Deposit: ");
        deposit = sc.nextDouble();
        a1.deposit(deposit);
        System.out.println("Withdraw: ");
        withdraw = sc.nextDouble();
        a1.withdraw(withdraw);
        sc.close();
    }
}
