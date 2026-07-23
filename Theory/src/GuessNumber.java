// GuessNumber.java: write a program that randomly generates an integer
// between 0 and 100, inclusive. The program prompts the user to enter
// a number continuously until the number matches the randomly generated number.
// For each user input, the program tells the user whether
// the input is too low or too high, so the user can choose
// the next input intelligently

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        // generates a random integer
        int randomInteger = (int)(Math.random()*101); // 0 <= x < 101

        System.out.println("Guess a magic number between 0 and 100");
        System.out.println();

        // first input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your guess: ");
        int guessNumber = sc.nextInt();

        while (true)
        {
            if (guessNumber > randomInteger)
                System.out.println("Your guess is too high");
            else if (guessNumber < randomInteger)
                System.out.println("Your guess is too low");
            else
            {
                System.out.println("Yes the number is " + randomInteger);
                break;  // out the infinity loop
            }
            // next inputs
            System.out.println();
            System.out.print("Enter your guess: ");
            guessNumber = sc.nextInt();
        }
    }
}