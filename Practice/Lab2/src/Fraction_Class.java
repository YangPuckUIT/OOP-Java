class Fraction {
    private int numerator;
    private int denominator;

    // Default constructor
    public Fraction() {
        numerator = 0;
        denominator = 1;
    }

    // Parameterized constructor
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be 0!");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    // GCD
    private int gcd(int a, int b) {
        if (b == 0) return Math.abs(a);
        return gcd(b, a % b);
    }

    // Simplify
    public void simplify() {
        int g = gcd(numerator, denominator);
        numerator /= g;
        denominator /= g;

        if (denominator < 0) {
            numerator *= -1;
            denominator *= -1;
        }
    }

    // Add
    public Fraction add(Fraction f) {
        int num = numerator * f.denominator + f.numerator * denominator;
        int den = denominator * f.denominator;
        return new Fraction(num, den);
    }

    // Subtract
    public Fraction subtract(Fraction f) {
        int num = numerator * f.denominator - f.numerator * denominator;
        int den = denominator * f.denominator;
        return new Fraction(num, den);
    }

    // Multiply
    public Fraction multiply(Fraction f) {
        return new Fraction(numerator * f.numerator, denominator * f.denominator);
    }

    // Divide
    public Fraction divide(Fraction f) {
        if (f.numerator == 0) {
            throw new ArithmeticException("Cannot divide by zero fraction!");
        }
        return new Fraction(numerator * f.denominator, denominator * f.numerator);
    }

    // Display
    public void display() {
        System.out.println(numerator + "/" + denominator);
    }
}
public class Fraction_Class {
    public static void main(String[] args) {

        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(3, 4);

        System.out.print("f1 = ");
        f1.display();

        System.out.print("f2 = ");
        f2.display();

        System.out.print("Addition: ");
        f1.add(f2).display();

        System.out.print("Subtraction: ");
        f1.subtract(f2).display();

        System.out.print("Multiplication: ");
        f1.multiply(f2).display();

        System.out.print("Division: ");
        f1.divide(f2).display();
    }
}