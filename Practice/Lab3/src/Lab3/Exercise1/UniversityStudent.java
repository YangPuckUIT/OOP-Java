package Lab3.Exercise1;

public class UniversityStudent extends Student {
    private String thesisTitle;
    private double thesisScore;

    // constructor
    public UniversityStudent(String studentId, String fullName, String address, int totalCredits, double gpa, String thesisTitle, double thesisScore) {
        super(studentId, fullName, address, totalCredits, gpa);
        this.thesisTitle = thesisTitle;
        this.thesisScore = thesisScore;
    }

    // getter
    public double getThesisScore() {
        return thesisScore;
    }

    @Override // đk tốt nghiệp
    public boolean isGraduate() {
        return totalCredits >= 170 && gpa >= 5.0 && thesisScore >= 5.0; // đk
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Thesis: " + thesisTitle + ", Score: " + thesisScore);
    }

}
