package Lab3.Exercise5;

public class ShowerGel extends Product {

    public ShowerGel(String id, String type, int volume) {
        super(id, type, volume);
    }

    @Override
    public double calculatePrice() {
        if (type.equals("Dry"))
            return volume * 20000;
        else
            return volume * 40000;
    }
}