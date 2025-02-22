import java.util.Scanner;

public class ex39_MaclaurinSinClaculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of x in radians: ");
        double x = scanner.nextDouble();
        scanner.close();

        double sinX = 0;
        int terms = 25; // up to x^49

        for (int n = 0; n < terms; n++) {
            int exponent = 2 * n + 1;  // Odd exponent: 1, 3, 5, ..., 49

            long factorial = 1;
            for (int i = 2; i <= exponent; i++) {
                factorial *= i;
            }

            double term = Math.pow(-1, n) * Math.pow(x, exponent) / factorial;

            sinX += term;
        }

        System.out.printf("Approximated sin(%.2f) using Maclaurin series: %.8f\n", x, sinX);
    }
}
