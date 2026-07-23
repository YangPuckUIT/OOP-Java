import java.util.Random;
import java.util.Scanner;

class Dice {
    private int num;
    private Random rd;

    // Constructor
    public Dice() {
        rd = new Random();
    }

    // Roll dice
    public int roll() {
        num = rd.nextInt(6) + 1; // 1 đến 6
        return num;
    }

    // Getter
    public int getNum() {
        return num;
    }
}

public class Dice_Class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dice dice = new Dice();

        System.out.print("Enter number of rolls (n): ");
        int n = sc.nextInt();

        int[] count = new int[7]; // index 1 đén 6

        // Roll n times
        for (int i = 0; i < n; i++) {
            int result = dice.roll();
            count[result]++;
        }

        // Print frequency vaf probability
        System.out.println("\nFace\tFrequency\tProbability");
        for (int i = 1; i <= 6; i++) {
            double prob = (double) count[i] / n;
            System.out.println(i + "\t\t" + count[i] + "\t\t\t" + prob);
        }
    }
}