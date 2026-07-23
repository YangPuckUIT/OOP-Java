package Lab3.Exercise4;
/*
    xài lại array of object
 */
public class Main {
    public static void main(String[] args) {
        /*
        tạo mảng singer (single array) chỉ đc 1 list nên sẽ phân biệt vs 2 ca sĩ qua
        new RegularSinger và FamousSinger
         */
        Singer[] list = new Singer[4];

        // nhập dữ liệu
        list[0] = new RegularSinger("Jack 97", 5, 10000, 20);
        list[1] = new RegularSinger("Hiếu Thứ 2", 3, 8000, 15);

        list[2] = new FamousSinger("Đen Vâu", 7, 20000, 30, 10);
        list[3] = new FamousSinger("Sơn Tùng MTP", 10, 30000, 40, 20);

        // tìm singer có lương cao nhất
        Singer top = null;

        for (Singer s : list) {
            if (top == null || s.calculateSalary() > top.calculateSalary()) {   // nếu s là singer nào thì xài ct lương của singer đó
                top = s;                                                        // xong so sánh vs top đã gán vs singer trc đó
            }
        }

        // in kết quả
        if (top != null) {
            System.out.println("Highest paid singer:");
            top.display();
        }
    }
}