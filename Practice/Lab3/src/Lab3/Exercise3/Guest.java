package Lab3.Exercise3;

public class Guest extends Person { // thêm mỗi id card
    private String idCard;

    public Guest(String fullName, int age, String idCard) {
        super(fullName, age);
        this.idCard = idCard;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("ID Card: " + idCard);
    }
}