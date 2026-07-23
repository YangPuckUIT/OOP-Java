package Lab3.Exercise5;

public class Customer {
    String id, name, address, phone;

    public Customer(String id, String name, String address, String phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public void display() {
        System.out.println("Customer: " + name + " - " + phone);
    }
}