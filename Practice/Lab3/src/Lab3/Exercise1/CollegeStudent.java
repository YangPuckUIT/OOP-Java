package Lab3.Exercise1;

public class CollegeStudent extends Student {   // kế thừa class Student
    private double graduationExamScore;

    // constructor
    public CollegeStudent(String studentId, String fullName, String address, int totalCredits, double gpa, double graduationExamScore) {
        super(studentId, fullName, address, totalCredits, gpa); // gọi construtor cuar lớp cha Student
        this.graduationExamScore = graduationExamScore;
    }

    //getter
    public double getGraduationExamScore() {
        return graduationExamScore;
    }

    @Override // ghi đè lên hàm cha (dữ liệu tốt nghiệp)
    public boolean isGraduate() {
        return totalCredits >= 120 && gpa >= 5.0 && graduationExamScore >= 5.0;
    }

    //hiển thị
    @Override
    public void display() {
        super.display();
        System.out.println("Exam score: " + graduationExamScore);
    }

}

