import java.util.Scanner;
import java.util.Random;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        boolean playAgain = true;

        System.out.println("Welcome to the Number Guessing Game!");

        while (playAgain) {
            int randNum = rand.nextInt(100) + 1;
            boolean guessedCorrectly = false;
            System.out.println("I am thinking of a number between 1 and 100. Can you guess it in 10 attempts?");
            int attempts = 10;

            while (!guessedCorrectly && attempts > 0) {

                System.out.print("Enter your guess: ");
                if (!sc.hasNextInt()) {
                    System.out.println("Invalid Input. Please enter a number between 1 and 100.");
                    sc.next();
                    continue;
                }

                int num = sc.nextInt();
                if (num < 1 || num > 100) {
                    System.out.println("Number out of range! Try a number between 1 and 100.");
                } else if (num == randNum) {
                    System.out.println("You guessed it. The number is: " + randNum);
                    guessedCorrectly = true;
                } else if (num < randNum) {
                    System.out.println("Your number is too small.");
                } else {
                    System.out.println("Your number is too large.");
                }
                attempts -= 1;
                System.out.println("Remaining Attempts:" + attempts);
                if (attempts == 0 && !guessedCorrectly) {
                    System.out.println("UhOh! You ran out of attempts.");
                    System.out.println("The number was: " + randNum);
                }
            }

            sc.nextLine();
            System.out.print("Do you want to play again? (yes / no): ");
            String input = sc.nextLine().trim().toLowerCase();
            if (input.equals("no") || input.equals("n")) {
                playAgain = false;
                System.out.println("Thanks For Playing!");
            }
        }
        sc.close();
    }
}