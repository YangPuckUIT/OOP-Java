package Lab3.Exercise2;

/*
làm list sv nhưng ko bt nên nhập từ bàn phím lúc chạy hay nhập trong main, nên e sẽ xài array of object (dạy ở lý thuyết 1 ít)
sv e sẽ nhập trong main trc khi chạy. Có 1 số câu lệnh e tìm hiểu trên mạng như instanceof để locj 2 loại sv là cao đẳng và đại hc
*/

public class Main {
    public static void main(String[] args) {

        // tạo mảng ticket dùng array of object
        Ticket[] list = new Ticket[4];

        // nhập dữ liệu ở đây
        list[0] = new FullTicket("T01", "Nguyen Van A", 2005, 10);
        list[2] = new FullTicket("T03", "Nguyen Van C", 2006, 20);
        list[3] = new PartialTicket("T04", "Nguyen Van D", 2003, 5);
        list[1] = new PartialTicket("T02", "Nguyen Van B", 2004, 3);

        // tổng doanh thu
        double totalRevenue = 0;

        for (Ticket t : list) {
            totalRevenue += t.calculatePrice();
        }

        System.out.println("Total revenue: " + totalRevenue);

        // đếm số vé Partial
        int countPartial = 0;

        for (Ticket t : list) {
            if (t instanceof PartialTicket) {   // nếu PartialTicket thì ++ ko thì thôi n trả về T or F
                countPartial++;
            }
        }

        System.out.println("Number of partial tickets: " + countPartial);
    }
}