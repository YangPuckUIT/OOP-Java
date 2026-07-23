package Lab3.Exercise1;

/*
làm list sv nhưng ko bt nên nhập từ bàn phím lúc chạy hay nhập trong main, nên e sẽ xài array of object (dạy ở lý thuyết 1 ít)
sv e sẽ nhập trong main trc khi chạy. Có 1 số câu lệnh e tìm hiểu trên mạng như instanceof để locj 2 loại sv là cao đẳng và đại hc
*/

public class Main {
    public static void main(String[] args) {

        Student[] list = new Student[4];    // độ da mảng (số sv)

        // nhập các sinh viên
        list[0] = new CollegeStudent("123456", "Nguyễn Văn A", "HCM", 130, 6.5, 7.0);
        list[1] = new CollegeStudent("654321", "Nguyễn Văn B", "Hà Nội", 100, 4.5, 6.0);

        list[2] = new UniversityStudent("24521386", "Nguyễn Dương Phúc", "Đồng Nai", 180, 8.0, "AI", 9.0);
        list[3] = new UniversityStudent("3679", "Nguyễn Thị C", "Quảng Trị", 160, 6.0, "Web", 5.5);

        // đếm số sv tốt nghiệp
        int count = 0;  // mới đầu chx có ai
        for (Student s : list) {    // xét các phần tử trong list
            if (s.isGraduate()) {
                count++;
            }
        }

        System.out.println("Number of graduated students: " + count);

        // tìm sv đại hc có điểm gpa cao nhất
        UniversityStudent top = null;
        for (Student s : list) {
            if (s instanceof UniversityStudent) {   // xét xem s có đúng là sv university ko
                UniversityStudent u = (UniversityStudent) s;

                if (top == null || u.getGpa() > top.getGpa()) {
                    top = u;
                }
            }
        }

        // kết quả
        if (top != null) {
            System.out.println("University student with the highest GPA: ");
            top.display();
        }
        else {
            System.out.println("not found.");
        }
    }
}