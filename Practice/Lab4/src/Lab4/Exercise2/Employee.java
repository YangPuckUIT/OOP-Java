package Lab4.Exercise2;

// abstract employee cha
// mấy employee khác extends từ đây

public abstract class Employee {

    protected String employeeID;
    protected String fullName;
    protected String dateOfBirth;
    protected String address;
    protected double salaryCoefficient;
    protected String startDate;

    // base salary cho chung luôn
    protected static final double BASE_SALARY = 1800000;

    public Employee(String employeeID, String fullName, String dateOfBirth,
                    String address, double salaryCoefficient, String startDate) {

        this.employeeID = employeeID;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.salaryCoefficient = salaryCoefficient;
        this.startDate = startDate;
    }

    // mỗi employee tính lương khác nhau
    abstract double calculateSalary();
}