import java.util.Scanner;

public class ex05_NumberToWeekday {
    public static void main(String[] args) {
        System.out.print("Enter a number (1-7): ");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        switch (userInput) {
            case 1 -> System.out.println("It's Monday!");
            case 2 -> System.out.println("It's Tuesday!");
            case 3 -> System.out.println("It's Wednesday!");
            case 4 -> System.out.println("It's Thursday!");
            case 5 -> System.out.println("It's Friday!");
            case 6 -> System.out.println("It's Saturday!");
            case 7 -> System.out.println("It's Sunday!");
            default -> System.out.println("Invalid input. Please enter an integer from 1 to 7.");
        }

        scanner.close();
    }
}
