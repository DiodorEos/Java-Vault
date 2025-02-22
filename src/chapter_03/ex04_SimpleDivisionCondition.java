import java.util.Scanner;

public class ex04_SimpleDivisionCondition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a whole number: ");
        int userInput = scanner.nextInt();

        if ((userInput % 3 == 0) && (userInput % 4 == 0)) {
            System.out.println("Divisible by both 3 and 4! The number times five: " + userInput * 5);
        } else {
            System.out.println("Not divisible by both 3 and 4! The number times ten: " + userInput * 10);
        }

        scanner.close();
    }
}
