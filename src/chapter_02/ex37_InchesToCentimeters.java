import java.util.Scanner;

public class ex37_InchesToCentimeters {
    public static void main(String[] args) {
        System.out.println("Input length in inches: ");
        Scanner scanner = new Scanner(System.in);
        double userInput = scanner.nextDouble();
        System.out.printf("\n%.2fin is %.2fcm.", userInput, userInput * 2.54);
        scanner.close();
    }
}
