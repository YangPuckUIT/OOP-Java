package Lab3.Exercise4;

public class RegularSinger extends Singer { // ko thêm thuộc tính chỉ overrriding thôi

    public RegularSinger(String fullName, int years, int albumsSold, int performances) {
        super(fullName, years, albumsSold, performances);
    }

    // override tính lương
    @Override
    public double calculateSalary() {
        return 3000000 + 500000*years + 1000*albumsSold + 200000*performances;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Type: Regular Singer");
        System.out.println("Salary: " + calculateSalary());
    }
}