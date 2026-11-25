import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int numberToGuess = random.nextInt(100) + 1;
		int numberOfAttempts = 0;
		int userGuess = 0;
		
		System.out.println("Welcome to the Number Guessing Game!");
		System.out.println("Try guessing a choosen number from 1 to 100");
		
		while (userGuess != numberToGuess) {
			System.out.println("Enter your guess: ");
			
			if (!scanner.hasNextInt()) {
				System.out.println("Please enter a valid number!");
				scanner.next();
				continue;
			}
			userGuess = scanner.nextInt();
			numberOfAttempts++;
			
			if (userGuess < numberToGuess) {
				System.out.println("Your guess is too low. Try again.");
				
			} else if (userGuess > numberToGuess) {
				System.out.println("Your guess is too high. Try again.");
			} else {
				System.out.println("\nCongratulations! You guessed the correct number!");
				System.out.println("It took you " + numberOfAttempts + " attempts.");
			}
		}
		scanner.close();
	}

}
