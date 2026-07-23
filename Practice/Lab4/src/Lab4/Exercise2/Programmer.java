package Lab4.Exercise2;

// programmer có thêm overtime

public class Programmer extends Employee {

    private double overtimePay;

    public Programmer(String employeeID, String fullName, String dateOfBirth,
                      String address, double salaryCoefficient,
                      String startDate, double overtimePay) {

        super(employeeID, fullName, dateOfBirth,
                address, salaryCoefficient, startDate);

        this.overtimePay = overtimePay;
    }

    @Override
    double calculateSalary() {
        return BASE_SALARY * salaryCoefficient + overtimePay;
    }
}