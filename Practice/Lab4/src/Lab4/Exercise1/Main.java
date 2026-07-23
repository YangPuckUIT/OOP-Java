package Lab4.Exercise1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // nhập số lượng gate
        System.out.print("Enter number of gates: ");
        int n = sc.nextInt();

        Gate[] gates = new Gate[n];

        // nhập từng gate
        for (int i = 0; i < n; i++) {

            System.out.println();
            System.out.println("Gate " + (i + 1));

            System.out.println("1. Business Gate");
            System.out.println("2. Academic Gate");
            System.out.println("3. Power Gate");

            System.out.print("Choose gate type: ");
            int type = sc.nextInt();

            if (type == 1) {

                System.out.print("Enter unit price: ");
                int unitPrice = sc.nextInt();

                System.out.print("Enter quantity: ");
                int quantity = sc.nextInt();

                gates[i] = new BusinessGate(unitPrice, quantity);
            }

            else if (type == 2) {

                System.out.print("Enter intelligence required: ");
                int iq = sc.nextInt();

                gates[i] = new AcademicGate(iq);
            }

            else if (type == 3) {

                System.out.print("Enter warrior power: ");
                int power = sc.nextInt();

                gates[i] = new PowerGate(power);
            }
        }

        System.out.println();

        // nhập stats prince
        System.out.print("Enter prince money: ");
        int money = sc.nextInt();

        System.out.print("Enter prince intelligence: ");
        int intelligence = sc.nextInt();

        System.out.print("Enter prince power: ");
        int power = sc.nextInt();

        Prince prince = new Prince(money, intelligence, power);

        System.out.println();

        boolean rescued = true;

        // polymorphism chỗ này
        for (int i = 0; i < n; i++) {

            boolean result = gates[i].passGate(prince);

            if (!result) {
                rescued = false;
                break;
            }
        }

        System.out.println();

        if (rescued) {
            System.out.println("The Prince rescued the Princess");
        }
        else {
            System.out.println("The Prince failed");
        }

        sc.close();
    }
}