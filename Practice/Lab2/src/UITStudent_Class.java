import java.util.Scanner;
import java.time.Year;
import java.util.*;

class UITStudent {
    private String name;
    private int birthYear;
    private String id;
    private double gpa;

    // Default constructor
    public UITStudent() {}

    // Parameterized constructor
    public UITStudent(String name, int birthYear, String id, double gpa) {
        this.name = name;
        this.birthYear = birthYear;
        this.id = id;
        this.gpa = gpa;
    }

    // Input
    public void input(Scanner sc) {
        sc.nextLine(); // clear buffer
        System.out.print("Name: ");
        name = sc.nextLine();

        System.out.print("Birth year: ");
        birthYear = sc.nextInt();

        sc.nextLine();
        System.out.print("ID: ");
        id = sc.nextLine();

        System.out.print("GPA: ");
        gpa = sc.nextDouble();
    }

    // Display
    public void display() {
        System.out.println("Name: " + name + ", Birth: " + birthYear +
                ", ID: " + id + ", GPA: " + gpa);
    }

    // Age
    public int getAge() {
        return Year.now().getValue() - birthYear;
    }

    // Graduation year
    public int getGradYear(String CTDT) {
        double years = 4;

        if (CTDT.equalsIgnoreCase("BCU")) years = 3.5;
        if (CTDT.equalsIgnoreCase("CTTT")) years = 4.5;

        int startYear = birthYear + 18;
        return (int)(startYear + years);
    }

    public double getGpa() {
        return gpa;
    }

    public String getName() {
        return name;
    }
}

public class UITStudent_Class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        UITStudent[] list = new UITStudent[5];

        // Input 5 students cso thểdđổi số lượng sv
        for (int i = 0; i < 5; i++) {
            System.out.println("\nEnter student " + (i+1));
            list[i] = new UITStudent();
            list[i].input(sc);
        }

        // Print age + graduation
        System.out.println("\nStudent Info");
        for (int i = 0; i < 5; i++) {
            list[i].display();
            System.out.println("Age: " + list[i].getAge());
            System.out.println("Grad Year (CQ): " + list[i].getGradYear("CQ"));
        }

        // Find highest GPA
        UITStudent best = list[0];
        for (int i = 1; i < 5; i++) {
            if (list[i].getGpa() > best.getGpa()) {
                best = list[i];
            }
        }
        System.out.println("\nBest student: " + best.getName());

        // Sort by graduation year
        for (int i = 0; i < 5 - 1; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (list[i].getGradYear("CQ") > list[j].getGradYear("CQ")) {
                    UITStudent temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }

        System.out.println("\nGraduation Order");
        for (int i = 0; i < 5; i++) {
            System.out.println(list[i].getName() + " - " +
                    list[i].getGradYear("CQ"));
        }
    }
}