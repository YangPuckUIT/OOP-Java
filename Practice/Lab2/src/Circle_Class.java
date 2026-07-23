class Circle {
    private double a; // tọa độ x
    private double b; // tọa độ y
    private double r; // bán kín

    // Constructor
    public Circle(double a, double b, double r) {
        if (r <= 0) {
            throw new IllegalArgumentException("Radius must be > 0");
        }
        this.a = a;
        this.b = b;
        this.r = r;
    }

    // Area
    public double area() {
        return Math.PI * r * r;
    }

    // Perimeter
    public double perimeter() {
        return 2 * Math.PI * r;
    }

    //
    public boolean testBelongs(double x, double y) {
        double distance = Math.sqrt((x - a)*(x - a) + (y - b)*(y - b));
        return distance <= r;
    }
}
public class Circle_Class {
    public static void main(String[] args) {

        Circle c = new Circle(0, 0, 5);

        System.out.println("Area: " + c.area());
        System.out.println("Perimeter: " + c.perimeter());

        double x = 3, y = 4;

        if (c.testBelongs(x, y)) {
            System.out.println("Point (" + x + "," + y + ") is inside the circle");
        } else {
            System.out.println("Point (" + x + "," + y + ") is outside the circle");
        }
    }
}