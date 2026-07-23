package Lab3.Exercise2;

public class PartialTicket extends Ticket {

    public PartialTicket(String ticketId, String fullName, int yearOfBirth, int numberOfGames) {
        super(ticketId, fullName, yearOfBirth, numberOfGames);
    }

    // override tính tiền
    @Override
    public double calculatePrice() {
        return 70000 + numberOfGames * 20000;   // nếu chs game thì tính thêm tiền
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Type: Partial Ticket");
        System.out.println("Price: " + calculatePrice());
    }
}