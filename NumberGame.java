import java.util.*;

public class NumberGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int maxRounds = 4;
        int maxScore = 0;

        for (int rounds = 1; rounds <= maxRounds; rounds++) {
            int generatedNumber = random.nextInt(100);
            int maxChances = 5;
            int attempts = 0;

            System.out.println("Round " + rounds);
            System.out.println("Guess the number (0-100):");

            do {
                System.out.println("Chances left: " + (maxChances - attempts));
                System.out.println("Enter your guess:");

                // Checking if the input is an integer or not
                while (!sc.hasNextInt()) {
                    System.out.println("Invalid input. Please enter a valid number:");
                    sc.next(); 
                }

                int guess = sc.nextInt();

                if (guess == generatedNumber) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    int roundScore = maxChances - attempts;
                    maxScore += roundScore;
                    System.out.println("Round score: " + roundScore);
                    break;
                } else if (guess > generatedNumber) {
                    System.out.println("Too large. Guess lower.");
                } else {
                    System.out.println("Too small. Guess higher.");
                }

                attempts++;
            } while (attempts < maxChances);

            if (attempts == maxChances) {
                System.out.println("Sorry! Max attempts reached.");
                System.out.println("The correct number was: " + generatedNumber);
            }

            System.out.println("Total score: " + maxScore);

            if (rounds < maxRounds) {
                System.out.println("Do you want to play another round? (yes/no)");
                String playAgain = sc.next().toLowerCase();

                if (!playAgain.equals("yes")) {
                    break;
                }
            }
        }

        System.out.println("Thanks for playing!!");
        System.out.println("Your final score is: " + maxScore);

        sc.close();
    }
}