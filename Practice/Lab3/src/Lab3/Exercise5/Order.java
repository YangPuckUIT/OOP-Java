package Lab3.Exercise5;

public class Order {
    String orderId, date;
    Customer customer;
    ProductPackage pkg;

    public Order(String orderId, String date, Customer customer, ProductPackage pkg) {
        this.orderId = orderId;
        this.date = date;
        this.customer = customer;
        this.pkg = pkg;
    }

    public double getPrice() {
        return pkg.calculatePrice();
    }

    public void display() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Date: " + date);
        customer.display();
        System.out.println("Total Price: " + getPrice());
    }
}