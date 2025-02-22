import java.util.InputMismatchException;
import java.util.Scanner;

public class ex36_GradingTable {
    public static void main(String[] args) {
        System.out.println("Please input the student grade:");
        Scanner scanner = new Scanner(System.in);
        int userInput;
        while (true) {
            try {
                userInput = scanner.nextInt();
                if (userInput < 0 || 100 < userInput) {
                    System.out.println("The input was invalid. Please input the student grade (0-100):");
                } else {
                    if (userInput <= 55) {
                        System.out.println("Grade: F");
                    } else if (userInput <= 70) {
                        System.out.println("Grade: C");
                    } else if (userInput <= 85) {
                        System.out.println("Grade: B");
                    } else {
                        System.out.println("Grade: A");
                    }
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input: only integers allowed.");
                System.out.println("Please input the student grade (0-100):");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}
