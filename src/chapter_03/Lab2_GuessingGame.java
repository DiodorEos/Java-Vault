import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab2_GuessingGame {
    public static void main(String[] args) {
        final int TOTALTRIES = 10;
        System.out.println("******************---- Guess the Number! ----******************");
        System.out.print("************ You have" + TOTALTRIES + "tries to guess the number ************");
        System.out.println("Acceptable try: Input an integer between the boundaries.");
        System.out.println("Unacceptable try: Input other type of value ex. string or char,");
        System.out.println(" char, or an integer that is out of bounds.");
        System.out.println("All player tries, either acceptable or not, are being counted.");
        Scanner scanner = new Scanner(System.in);

        String playerInput;
        int playerGuess;
        int secret = (int) ((Math.random() * 100) + 1); // random number between 1 and 100.
        System.out.println(secret);
        int count = 0;
        while (true) {
            if (count == TOTALTRIES){
                System.out.println("Sorry, you lost! The secret number was " + secret + ".");
                System.out.println("Better luck next time!");
                System.out.println("Would you like to play again? (Y/y):");
                playerInput = scanner.nextLine();
                if (playerInput.equals("Y") || playerInput.equals("y")) {
                    count = 0;
                    secret = (int) ((Math.random() * 100) + 1); // re-randomize the secret number.
                } else {
                    break;
                }
            }
            count += 1;
            System.out.println("Input an integer between 1 and 100:");
            System.out.print("Try number ==> " + count + "\n");
            try{
                playerGuess = scanner.nextInt();
                scanner.nextLine();
                if (100 < playerGuess || playerGuess < 1) {
                    System.out.println("Your input was out of bounds.");
                    if (count < TOTALTRIES) System.out.println("Try again!");
                    scanner.nextLine();
                } else {
                    if (playerGuess == secret){
                        System.out.print("Congratulations! Your input " + playerGuess + " was the secret number!\n You guessed it after " + count + " tries!\n");
                        System.out.println(" Would you like to play again? (Y/y):");
                        playerInput = scanner.nextLine();
                        if (playerInput.equals("Y") || playerInput.equals("y")) {
                            count = 0;
                            secret = (int) ((Math.random() * 100) + 1); // re-randomize the secret number.
                        } else {
                            break;
                        }
                    } else if (playerGuess < secret) {
                        System.out.println("Your " + playerGuess + " is smaller than the secret number.");
                        if (count < TOTALTRIES) System.out.println("Try again!");
                    } else {
                        System.out.println("Your " + playerGuess + " is greater than the secret number.");
                        if (count < TOTALTRIES) System.out.println("Try again!");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Your input was unacceptable.");
                if (count < TOTALTRIES) System.out.println("Try again!");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}
