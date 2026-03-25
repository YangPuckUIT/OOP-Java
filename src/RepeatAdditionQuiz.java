// RepeatAdditionQuiz.jovo: Recall that AdditionQuiz.java is a program that
// prompts the user to enter on answer for a question on addition of
// two single digits. Using a loop, we can now rewrite the program
// to let the user enter a new answer until it is correct

import java.util.Scanner;

public class RepeatAdditionQuiz {
    public static void main(String[] args) {
        // randomize 2 digits
        int number1 = (int)(Math.random()*10); // because 0.0 ≤ x < 1.0 => *10 and int
        int number2 = (int)(Math.random()*10);

        // input answer
        Scanner sc = new Scanner(System.in);
        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = sc.nextInt();

        // check the result
        while (answer != number1 + number2)
        {
            System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
            answer = sc.nextInt();
        }

        // correct answer
        System.out.println("You got it!");

    }
}
