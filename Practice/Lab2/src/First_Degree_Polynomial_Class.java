class FirstDegreePolynomial {
    private double a;
    private double b;

    // Constructor
    public FirstDegreePolynomial(double a, double b) {
        if (a == 0) {
            throw new IllegalArgumentException("a must not be 0");
        }
        this.a = a;
        this.b = b;
    }

    // Evaluate F(x) tại x0
    public double evaluate(double x0) {
        return a * x0 + b;
    }

    // Find root (ax + b = 0)
    public double findRoot() {
        return -b / a;
    }

    // Add 2 polynomials
    public FirstDegreePolynomial add(FirstDegreePolynomial p) {
        double newA = this.a + p.a;
        double newB = this.b + p.b;

        if (newA == 0) {
            throw new IllegalArgumentException("Result is not first-degree polynomial");
        }

        return new FirstDegreePolynomial(newA, newB);
    }

    // Display
    public void display() {
        System.out.println("F(x) = " + a + "x + " + b);
    }
}
public class  First_Degree_Polynomial_Class {
    public static void main(String[] args) {

        FirstDegreePolynomial p1 = new FirstDegreePolynomial(2, 3);
        FirstDegreePolynomial p2 = new FirstDegreePolynomial(1, -5);

        System.out.print("P1: ");
        p1.display();

        System.out.print("P2: ");
        p2.display();

        // Evaluate
        double x0 = 2;
        System.out.println("P1(" + x0 + ") = " + p1.evaluate(x0));

        // Root
        System.out.println("Root of P1: " + p1.findRoot());

        // Add
        FirstDegreePolynomial p3 = p1.add(p2);
        System.out.print("P1 + P2 = ");
        p3.display();
    }
}