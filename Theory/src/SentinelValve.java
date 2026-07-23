// SentinelValve.java: Often the number of times a loop is executed
// is not predetermined. You may use an input value to Signify
// the end of the loop. Such a value is known as a sentinel value.
// Write a program that reads and calculates the sum of
// an unspecified number of integers. The input 0 signifies
// the end of the input.

import java.util.Scanner;

public class SentinelValve {
    public static void main(String[] args) {

        System.out.print("Enter an integer (the input and if it is 0): ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();  // first input

        int sum = 0;

        while (number != 0)
        {
            sum += number;
            System.out.print("Enter an integer (the input and if it is 0): ");
            number = sc.nextInt();  // next inputs
        }

        System.out.println("The sum is " + sum);
    }
}
