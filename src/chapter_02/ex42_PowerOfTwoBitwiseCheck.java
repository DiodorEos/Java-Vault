import java.util.Scanner;

public class ex42_PowerOfTwoBitwiseCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an integer to check whether it's a power of two: ");
        int userInput = scanner.nextInt();
        /* A power of two has exactly one '1' bit in binary.
        n & (n - 1) == 0 removes the rightmost '1' and checks if the result is 0. */
        System.out.println("The number is a power of two: " + ((userInput & (userInput - 1)) == 0) );
        scanner.close();
    }
}
