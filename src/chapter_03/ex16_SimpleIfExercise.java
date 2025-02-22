import java.util.Scanner;

public class ex16_SimpleIfExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int selection = scanner.nextInt();
        int number;
        if (selection == 2 || selection == 4 || selection == 5 || selection == 9) {
            number = selection;
        } else {
            number = 0;
        }
        System.out.println(number);
    }
}
