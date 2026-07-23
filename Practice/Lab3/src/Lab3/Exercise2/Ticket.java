package Lab3.Exercise2;

public class Ticket {
    protected String ticketId;
    protected String fullName;
    protected int yearOfBirth;
    protected int numberOfGames;

    // constructor
    public Ticket(String ticketId, String fullName, int yearOfBirth, int numberOfGames) {
        this.ticketId = ticketId;
        this.fullName = fullName;
        this.yearOfBirth = yearOfBirth;
        this.numberOfGames = numberOfGames;
    }

    // hàm tính tiền class con sẽ override
    public double calculatePrice() {
        return 0;
    }

    // hiển thị thông tin
    public void display() {
        System.out.println("ID: " + ticketId);
        System.out.println("Name: " + fullName);
        System.out.println("Year of Birth: " + yearOfBirth);
        System.out.println("Games played: " + numberOfGames);
    }
}