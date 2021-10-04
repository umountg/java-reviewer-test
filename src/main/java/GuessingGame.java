import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        int computerNumber = (int) (Math.random() * 100 + 1);
        System.out.println("A random number has been generated...");
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Attempt No " + (i + 1));
            guess(computerNumber, scanner);
        }

        System.out.println("Sorry for your luck, restart the program to play again!");
    }

    private static void guess(final int computerNumber, final Scanner scanner) {
        int userAnswer;
        userAnswer = askForNumber(scanner);
        proccessUserAnswer(computerNumber, userAnswer);
    }

    private static void proccessUserAnswer(final int computerNumber, final int userAnswer) {
        if (userAnswer <= 0 || userAnswer > 100) {
            System.out.println("Invalid response");
        } else if (userAnswer == computerNumber) {
            System.out.println("Correct! You win! See you next time!");
            System.exit(0);
        } else if (userAnswer > computerNumber) {
            System.out.println("Your guess is too high, guess again.");
        } else if (userAnswer < computerNumber) {
            System.out.println("Your guess is too low, guess again.");
        } else {
            System.out.println("Your guess is incorrect");
        }
    }

    private static int askForNumber(final Scanner scanner) {
        System.out.println("Enter a guess between 1 and 100");
        return scanner.nextInt();
    }
}