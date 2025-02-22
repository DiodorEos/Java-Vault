import java.util.Scanner;

public class ex43_ThreeDigitInt_DigitsAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input a three digit integer (100-999): ");
        int userInput = scanner.nextInt();
        int first = userInput / 100;
        int second = (userInput / 10) % 10;
        int third = userInput % 10;
        int digitSum = first + second + third;
        System.out.println("The given number's sum of digits is: " + digitSum);
    }
}
