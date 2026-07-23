package Lab4.Exercise2;

// tester có thêm tiền theo số lỗi tìm được

public class Tester extends Employee {

    private int error;

    public Tester(String employeeID, String fullName, String dateOfBirth,
                  String address, double salaryCoefficient,
                  String startDate, int error) {

        super(employeeID, fullName, dateOfBirth,
                address, salaryCoefficient, startDate);

        this.error = error;
    }

    @Override
    double calculateSalary() {
        return BASE_SALARY * salaryCoefficient + error * 200000;
    }
}