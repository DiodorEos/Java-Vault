import java.util.Scanner;

public class ex38_FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the temperature in Fahrenheit:");
        double fahrenheit = scanner.nextDouble();
        System.out.printf("%.2f Fahrenheit is %.2f Celsius.", fahrenheit, (5.0/9.0*(fahrenheit-32.0)));
        scanner.close();
    }
}
