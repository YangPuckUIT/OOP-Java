package Lab4.Exercise2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {

            System.out.println();
            System.out.println("Employee " + (i + 1));

            System.out.println("1. Manager");
            System.out.println("2. Programmer");
            System.out.println("3. Designer");
            System.out.println("4. Tester");

            System.out.print("Choose employee type: ");
            int type = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter employee ID: ");
            String id = sc.nextLine();

            System.out.print("Enter full name: ");
            String name = sc.nextLine();

            System.out.print("Enter date of birth: ");
            String dob = sc.nextLine();

            System.out.print("Enter address: ");
            String address = sc.nextLine();

            System.out.print("Enter salary coefficient: ");
            double coefficient = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter start date: ");
            String startDate = sc.nextLine();

            if (type == 1) {

                employees[i] = new Manager(
                        id, name, dob,
                        address, coefficient, startDate
                );
            }

            else if (type == 2) {

                System.out.print("Enter overtime pay: ");
                double overtime = sc.nextDouble();

                employees[i] = new Programmer(
                        id, name, dob,
                        address, coefficient,
                        startDate, overtime
                );
            }

            else if (type == 3) {

                System.out.print("Enter bonus: ");
                double bonus = sc.nextDouble();

                employees[i] = new Designer(
                        id, name, dob,
                        address, coefficient,
                        startDate, bonus
                );
            }

            else if (type == 4) {

                System.out.print("Enter number of errors found: ");
                int error = sc.nextInt();

                employees[i] = new Tester(
                        id, name, dob,
                        address, coefficient,
                        startDate, error
                );
            }

            sc.nextLine();
        }

        double totalSalary = 0;

        // polymorphism chỗ này
        for (int i = 0; i < n; i++) {

            double salary = employees[i].calculateSalary();

            totalSalary += salary;
        }

        System.out.println();
        System.out.println("Total company salary: " + totalSalary);

        sc.close();
    }
}