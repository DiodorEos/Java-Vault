import java.util.Scanner;

public class ex39_ThreeDoublesMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide with the first double number: ");
        double first = scanner.nextDouble();
        System.out.println("Provide with the second double number: ");
        double second = scanner.nextDouble();
        System.out.println("Provide with the third double number: ");
        double third = scanner.nextDouble();
        /* If the input is 5.4a as the exercises asks, then we get an InputMismatchException in console
        and the program stops. */
        System.out.printf("The average of the three numbers is: %.2f", (first + second + third)/3 );
        double maximum = Math.max(Math.max(first, second), third);
        System.out.println("The max number is: " + maximum);
        double minimum = Math.min(Math.min(first, second), third);
        System.out.println("The min number is: " + minimum);
    }
}
