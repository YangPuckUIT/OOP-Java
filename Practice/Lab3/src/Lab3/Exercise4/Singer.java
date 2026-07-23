package Lab3.Exercise4;

public class Singer {
    protected String fullName;
    protected int years;
    protected int albumsSold;
    protected int performances;

    // Constructor
    public Singer(String fullName, int years, int albumsSold, int performances) {
        this.fullName = fullName;
        this.years = years;
        this.albumsSold = albumsSold;
        this.performances = performances;
    }

    // hàm tính lương (class con override)
    public double calculateSalary() {
        return 0;
    }

    // hiển thị
    public void display() {
        System.out.println("Name: " + fullName);
        System.out.println("Years: " + years);
        System.out.println("Albums sold: " + albumsSold);
        System.out.println("Performances: " + performances);
    }
}