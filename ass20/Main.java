class ElectricityBill {
    private final String customerName;
    private final int customerId;
    private final int unitsConsumed;
    private double basicBill;
    private double surcharge=0;
    private double totalBill;

    public ElectricityBill(String customerName, int customerId, int unitsConsumed) {
        this.customerName = customerName;
        this.customerId = customerId;
        this.unitsConsumed = unitsConsumed;
    }

    void calculateBill() {
        if (unitsConsumed <= 100) {
            basicBill = unitsConsumed * 2.0;
        } else if (unitsConsumed <= 200) {
            basicBill = 200.0 + ((unitsConsumed - 100) * 3.0);
        }
        else {
            basicBill = 500.0 + ((unitsConsumed - 200) * 5.0);
        }

        if (basicBill > 1000) {
            surcharge = 0.05 * basicBill;
        }
        totalBill = surcharge + basicBill;
    }
    
    void display() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Basic Bill: Rs. " + basicBill);
        System.out.println("Surcharge: Rs. " + surcharge);
        System.out.println("Total Bill: Rs. " + totalBill);
    }
}

public class Main{
    public static void main(String[] args) {
        ElectricityBill e1 = new ElectricityBill(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]));
        e1.calculateBill();
        e1.display();
    }
}