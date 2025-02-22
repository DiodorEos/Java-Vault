import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab1_DiamondShape {
    static public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Please enter an integer between 3 and 100: ");
                int numOfRows = scanner.nextInt();

                if (100 <= numOfRows || numOfRows < 3) {
                    System.out.println("Error: integer out of bounds.");
                } else {
                    int spaces = numOfRows;
                    // If rows given are even or odd, so that the rhombus has different shape.
                    if (numOfRows % 2 == 0){
                        for (int i = 1; i <= numOfRows; i+=2 ) {
                            System.out.print(" ".repeat(spaces));
                            System.out.print("*".repeat(i));
                            System.out.println();
                            --spaces;
                        }
                        spaces += 1;
                        for (int i = numOfRows - 1; i > 0; i-=2) {
                            System.out.print(" ".repeat(spaces));
                            System.out.print("*".repeat(i));
                            System.out.println();
                            ++spaces;
                        }
                    } else {
                        for (int i = 1; i <= numOfRows; i+=2 ) {
                            System.out.print(" ".repeat(spaces));
                            System.out.print("*".repeat(i));
                            System.out.println();
                            --spaces;
                        }
                        spaces += 2;
                        for (int i = numOfRows - 2; i > 0; i-=2) {
                            System.out.print(" ".repeat(spaces));
                            System.out.print("*".repeat(i));
                            System.out.println();
                            ++spaces;
                        }
                    }
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error.");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}