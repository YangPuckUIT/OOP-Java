package Lab4.Exercise2;

// designer có bonus

public class Designer extends Employee {

    private double bonus;

    public Designer(String employeeID, String fullName, String dateOfBirth,
                    String address, double salaryCoefficient,
                    String startDate, double bonus) {

        super(employeeID, fullName, dateOfBirth,
                address, salaryCoefficient, startDate);

        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return BASE_SALARY * salaryCoefficient + bonus;
    }
}