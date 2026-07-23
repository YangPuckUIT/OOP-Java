package Lab3.Exercise2;

public class FullTicket extends Ticket {    // ko thêm thuộc tính như bài 1

    public FullTicket(String ticketId, String fullName, int yearOfBirth, int numberOfGames) {
        super(ticketId, fullName, yearOfBirth, numberOfGames);
    }

    // override tính tiền
    @Override
    public double calculatePrice() {
        return 200000;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Type: Full Package Ticket");
        System.out.println("Price: " + calculatePrice());
    }
}