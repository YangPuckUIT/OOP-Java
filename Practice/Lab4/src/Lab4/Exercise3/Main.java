package Lab4.Exercise3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // nhập danh sách people
        System.out.print("Enter number of people: ");
        int n = sc.nextInt();
        sc.nextLine();

        Person[] people = new Person[n];

        for (int i = 0; i < n; i++) {

            System.out.println();
            System.out.println("Person " + (i + 1));

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter ABO blood type: ");
            String abo = sc.nextLine();

            System.out.print("Enter Rh (+ or -): ");
            String rh = sc.nextLine();

            BloodType bloodType = new BloodType(abo, rh);

            people[i] = new Person(name, bloodType);
        }

        // check child blood type
        System.out.println();
        System.out.println("=== Check child blood type ===");

        System.out.print("Enter father index: ");
        int fatherIndex = sc.nextInt();

        System.out.print("Enter mother index: ");
        int motherIndex = sc.nextInt();

        System.out.print("Enter child index: ");
        int childIndex = sc.nextInt();

        Person father = people[fatherIndex];
        Person mother = people[motherIndex];
        Person child = people[childIndex];

        boolean valid = BloodType.isValidChild(
                father.getBloodType(),
                mother.getBloodType(),
                child.getBloodType()
        );

        System.out.println();

        if (valid) {
            System.out.println("Child blood type is valid");
        }
        else {
            System.out.println("Child blood type is NOT valid");
        }

        // chọn người nhận máu
        System.out.println();
        System.out.print("Choose receiver index: ");
        int x = sc.nextInt();

        Person receiver = people[x];

        System.out.println();
        System.out.println("People who can donate to "
                + receiver.getName() + ":");

        for (int i = 0; i < n; i++) {

            if (i == x) {
                continue;
            }

            if (people[i].getBloodType()
                    .canDonateTo(receiver.getBloodType())) {

                System.out.println(
                        people[i].getName()
                                + " - "
                                + people[i].getBloodType().getFullType()
                );
            }
        }

        sc.close();
    }
}