package Lab3.Exercise3;

public class Room {
    private String type;
    private double price;
    private int days;
    private Guest guest;    // room chứa kiểu dữ liệu guest

    // constructor
    public Room(String type, int days) {
        this.type = type;
        this.days = days;
     // this.guest = guest; (thường sẽ thêm vậy nhưng đề kêu là viết method add vs remvoe nên cái này ko cần để tí viết method add)
        this.guest = null; // phòng ban đầu trống
        setPriceByType();
    }
    // set giá theo loại phòng
/*
 ko xài type == "VIP1" đc vì nó so có trỏ đến bộ nhớ VIP1 ko (lỡ có 2 o nhớ chứa VIP1 và a,b trỏ lần lượt 2 VIP1
 thì khi so sánh dù a,b đều VIP1 nhưng nó cx ko nhận vì khác đ/c => sai
 cần xét nội dung bên trong type nên phải xài equals
*/
    private void setPriceByType() {
        if (type.equals("VIP1")) {
            price = 900000;
        } else if (type.equals("VIP2")) {
            price = 700000;
        } else if (type.equals("VIP3")) {
            price = 500000;
        } else {
            price = 0;
        }
    }

    // thêm khách
    public void addGuest(Guest guest) {
        if (this.guest == null) {
            this.guest = guest;
            System.out.println("Guest added successfully");
        }
        else {
            System.out.println("Room already has a guest");
        }
    }
    // xóa khách
    public void removeGuest() {
        if (this.guest != null) {
            this.guest = null;
            System.out.println("Guest removed");
        }
        else {
            System.out.println("Room already empty");
        }
    }

    // tính tiền
    public double calculateCost() {
        return price * days;
    }

    // hiển thị thông tin
    public void display() {
        System.out.println("Room Type: " + type);
        System.out.println("Price per day: " + price);
        System.out.println("Days: " + days);
        System.out.println("Total cost: " + calculateCost());

        if (guest != null) {
            System.out.println("Guest information:");
            guest.display();
        }
        else {
            System.out.println("Room is empty");
        }
    }
}