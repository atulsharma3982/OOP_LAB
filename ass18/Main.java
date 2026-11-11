abstract class Payment {
    private int transactionId;
    private double amount;

    Payment(int transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }

    public void displayBasicDetails() {
        System.out.println("Transaction ID: TXN" + transactionId);
        System.out.println("Amount: Rs. " + amount);
    }

    abstract void processPayment();
    abstract void displayPaymentDetails();
}

class CreditCardPayment extends Payment {
    CreditCardPayment(int transactionId, double amount) {
        super(transactionId, amount);
    }

    @Override
    void processPayment() {
        System.out.println("Payment processed using Credit Card.");
    }

    @Override
    void displayPaymentDetails() {
        System.out.println("Credit Card Payment Details displayed.");
    }
}

class UPIPayment extends Payment {
    UPIPayment(int transactionId, double amount) {
        super(transactionId, amount);
    }
    
    @Override 
    void processPayment() {
        System.out.println("Payment processed using UPI.");
    }

    @Override 
    void displayPaymentDetails() {
        System.out.println("UPI Payment Details displayed.");
    }
}

public class Main {
    public static void main(String[] args) {
        CreditCardPayment c1 = new CreditCardPayment(101, 2500);
        UPIPayment u1 = new UPIPayment(102, 1500);
        System.out.println("----- CREDIT CARD PAYMENT -----");
        c1.displayBasicDetails();
        c1.processPayment();
        c1.displayPaymentDetails();
        System.out.println("----- UPI Payment -----");
        u1.displayBasicDetails();
        u1.processPayment();
        u1.displayPaymentDetails();
    }
}