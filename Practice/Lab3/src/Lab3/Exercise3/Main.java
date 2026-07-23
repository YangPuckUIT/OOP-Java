package Lab3.Exercise3;

public class Main {
    public static void main(String[] args) {

        // tạo khách
        Guest g1 = new Guest("Chí Phèo", 22, "123456789");
        Guest g2 = new Guest("Thị Nở", 20, "987654321");

        // tạo phòng (ban đầu trống)
        Room r1 = new Room("VIP1", 3);
        Room r2 = new Room("VIP3", 2);

        // thêm khách vào phòng
        r1.addGuest(g1);
        r2.addGuest(g2);

        System.out.println();

        // hiển thị thông tin từng phòng để kt
        System.out.println("Room 1");
        r1.display();

        System.out.println();

        System.out.println("Room 2");
        r2.display();

        System.out.println();

        // test thử remove khách phòng 1
        System.out.println("Remove guest from room 1");
        r1.removeGuest();

        System.out.println();

        // hiển thị room 1 sau khi remove khách
        System.out.println("Room 1 after remove");
        r1.display();   // h display thì chỉ hiện thông tin phòng thôi ko có thông tin khách nx

        System.out.println();

        // thử add guest vô room 1 lại
        System.out.println("Add guest to room 1 again");
        r1.addGuest(g2);

        System.out.println();

        System.out.println("Room 1 after adding guest again");
        r1.display();
    }
}