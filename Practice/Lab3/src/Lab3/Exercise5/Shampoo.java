package Lab3.Exercise5;

public class Shampoo extends Product {
    String standard;

    public Shampoo(String id, String type, int volume, String standard) {
        super(id, type, volume);
        this.standard = standard;
    }

    @Override
    public double calculatePrice() {
        if (type.equals("Dry"))
            return volume * 20000;
        else {
            if (standard.equals("1"))
                return volume * 30000;
            else
                return volume * 40000;
        }
    }
}