package Lab3.Exercise3;

public class Staff extends Person { // thêm license vs employee id
    private String licenseId;
    private String employeeId;

    public Staff(String fullName, int age, String licenseId, String employeeId) {
        super(fullName, age);
        this.licenseId = licenseId;
        this.employeeId = employeeId;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("License ID: " + licenseId);
        System.out.println("Employee ID: " + employeeId);
    }
}