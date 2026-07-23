package Lab4.Exercise2;

// manager chỉ tính base * coefficient

public class Manager extends Employee {

    public Manager(String employeeID, String fullName, String dateOfBirth,
                   String address, double salaryCoefficient, String startDate) {

        super(employeeID, fullName, dateOfBirth,
                address, salaryCoefficient, startDate);
    }

    @Override
    double calculateSalary() {
        return BASE_SALARY * salaryCoefficient;
    }
}