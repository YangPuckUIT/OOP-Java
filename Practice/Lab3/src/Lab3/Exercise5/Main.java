/*
Order:
  Customer
  ProductPackage:
         RomanticPackage
         FreshAirPackage
Product:
  Perfume
  Shampoo
  ShowerGel
 */

package Lab3.Exercise5;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        // customer
        Customer c1 = new Customer("C01", "Nguyen Van A", "HCM", "0123456789");

        // products
        Perfume p = new Perfume("P01", "Rose", 10);
        Shampoo s = new Shampoo("S01", "Oily", 10, "1");
        ShowerGel g = new ShowerGel("G01", "Dry", 5);

        // package
        RomanticPackage pkg1 = new RomanticPackage(p);
        pkg1.shampoo = s;
        pkg1.gel = g;

        // order
        Order o1 = new Order("O01", "01-01-2026", c1, pkg1);

        // display
        o1.display();

        // ghi file
        try {
            FileWriter fw = new FileWriter("order_list.txt");
            fw.write("Order ID: " + o1.orderId + "\n");
            fw.write("Customer: " + c1.name + "\n");
            fw.write("Total Price: " + o1.getPrice());
            fw.close();

            System.out.println("Saved to file successfully!");
        } catch (IOException e) {
            System.out.println("Error writing file!");
        }
    }
}