import java.util.Scanner;

class OrderConfirmation extends Thread{
    private String customerName;
    OrderConfirmation(String name){
        customerName=name;
    }
    public void run(){
        System.out.println("Order confirmed for " + customerName);
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class FoodPreparation extends Thread{
    public void run(){
        System.out.println("Food preparation started");
        System.out.println("Food preparation completed");
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Delivery extends Thread{
    public void run(){
        System.out.println("Delivery started");
        System.out.println("Order delivered");
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


class Order{
    private int orderID;
    private String customerName;
    private String foodItem;

    Order(int orderID, String customerName, String foodItem){
        this.orderID = orderID;
        this.customerName = customerName;
        this.foodItem = foodItem;
    }

    public void displayDetails(){
        System.out.println("Order ID: " + orderID);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Food Item: " + foodItem);
        System.out.println();
    }

    public void processOrder(){
        OrderConfirmation o = new OrderConfirmation(customerName);
        FoodPreparation f = new FoodPreparation();
        Delivery d = new Delivery();
        o.start();
        f.start();
        d.start();
    }
}

public class Main{
    public static void main(String[] args) {
        int orderID;
        String name;
        String foodItem;
        Scanner sc = new Scanner(System.in);
        System.out.print("Order ID: ");
        orderID = sc.nextInt();
        System.out.print("Customer Name: ");
        name = sc.next();
        System.out.print("Food Item: ");
        foodItem = sc.next();
        sc.close();
        System.out.println();
        Order o = new Order(orderID, name, foodItem);
        o.displayDetails();
        o.processOrder();
    }
}