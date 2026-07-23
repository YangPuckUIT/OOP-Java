package Lab3.Exercise5;

public class Perfume extends Product {

    public Perfume(String id, String type, int volume) {
        super(id, type, volume);
    }

    @Override
    public double calculatePrice() {
        if (type.equals("Rose"))
            return volume * 20000;
        else
            return volume * 15000;
    }
}