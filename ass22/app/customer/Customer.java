package customer;

public class Customer{
    private int customerId;
    private String customerName;
    private long phoneNumber;

    public Customer(int customerId, String customerName, long phoneNumber) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
    }

    public void display() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Name: " + customerName);
        // System.out.println("Phone: " + phoneNumber);
    }
}