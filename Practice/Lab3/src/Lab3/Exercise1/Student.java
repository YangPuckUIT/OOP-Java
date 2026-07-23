package Lab3.Exercise1;

public class Student {
    protected String studentID; // xài String thay cho int vì vd 001 mà xài int nó chỉ là 1
    protected String fullName;
    protected String address;
    protected int totalCredits;
    protected double gpa;

    // constructor có tham số
    public Student (String studentID, String fullName, String address, int totalCredits, double gpa) {
        this.studentID = studentID;
        this.fullName = fullName;
        this.address = address;
        this.totalCredits = totalCredits;
        this.gpa = gpa;
    }

    // getter
    public double getGpa() {
        return gpa;
    }

    // method để override (xem có tốt nghiệp ko)
    public boolean isGraduate() {
        return false;
    }

    // hiển thị thoog tin
    public void display() {
        System.out.println("ID: " + studentID + ", Name: " + fullName + ", GPA: " + gpa);
    }
}
