package Lab3.Exercise5;

public class ProductPackage {
    Perfume perfume;
    Shampoo shampoo;
    ShowerGel gel;

    public double calculatePrice() {
        double total = 0;

        if (perfume != null) total += perfume.calculatePrice();
        if (shampoo != null) total += shampoo.calculatePrice();
        if (gel != null) total += gel.calculatePrice();

        return total;
    }
}