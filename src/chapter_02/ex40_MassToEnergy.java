import java.util.Scanner;

public class ex40_MassToEnergy {
    /* Using the speed of light as a constant. 300000 is given by the exercise.
    Also, C squared is always the same, so it can be a constant too.
    Everything could also be written as numbers in code, but this makes more sense. */
    public static final double SPEED_OF_LIGHT = 300_000_000;
    public static final double C_SQUARED = Math.pow(SPEED_OF_LIGHT, 2);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("To calculate the relative energy, provide the rest mass of the particle in kilograms: ");
        double mass = scanner.nextDouble();
        System.out.println("The mass given is equivalent to: " + mass*C_SQUARED + " Joules of energy.");
        scanner.close();
    }
}
