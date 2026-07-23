package Lab4.Exercise4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of people: ");
        int n = sc.nextInt();
        sc.nextLine();

        Person[] people = new Person[n];

        // nhập list people
        for (int i = 0; i < n; i++) {

            System.out.println();
            System.out.println("Person " + (i + 1));

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            // nhập kiểu O70-C30-E60-A96-N10
            System.out.print("Enter result: ");
            String result = sc.nextLine();

            // split chuỗi
            String[] arr = result.split("-");

            int o = Integer.parseInt(arr[0].substring(1));
            int c = Integer.parseInt(arr[1].substring(1));
            int e = Integer.parseInt(arr[2].substring(1));
            int a = Integer.parseInt(arr[3].substring(1));
            int nn = Integer.parseInt(arr[4].substring(1));

            people[i] = new Person(
                    name,
                    new Openness(o),
                    new Conscientiousness(c),
                    new Extraversion(e),
                    new Agreeableness(a),
                    new Neuroticism(nn)
            );
        }

        // chọn person để show
        System.out.println();
        System.out.print("Choose person index: ");
        int x = sc.nextInt();

        System.out.println();
        people[x].showPersonality();

        // show high risk people
        System.out.println();
        System.out.println("High risk people:");

        for (int i = 0; i < n; i++) {

            if (people[i].isHighRisk()) {
                System.out.println(people[i].getName());
            }
        }

        sc.close();
    }
}