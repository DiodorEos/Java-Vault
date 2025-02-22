import java.util.Scanner;

public class ex44_VendingMachineChange {
    public static void main(String[] args) {
        double cost = 1.2;
        System.out.printf("The ticket cost is %.2f euro.\n", cost);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of tickets needed: ");
        int numOfTickets = scanner.nextInt();
        /* I am rounding the amount multiplied by 100 so that the final amount won't change.
        Then, I am dividing it by 100.0 so that it will remain double and show an amount that makes sense.
        ex.: 3.5999997 * 100 = 359.99997 -> rounding -> 360 -> / 100.0 -> 3.6
         */
        double amount = Math.round((numOfTickets * cost) * 100) / 100.0;
        System.out.printf("The amount is %.2f euro.\n", amount);
        System.out.println("Enter the amount of euro you inserted on the machine: ");
        double pay = scanner.nextDouble();
        /* The change should be calculated first as double and multiplied with 100 so that the casting to int
                won't affect the rounding and calculations. */
        int changes = (int) Math.round((pay - amount) * 100);
        System.out.printf("Your change in cents is: %d\n", changes);
        int numOf5 = changes/500;
        changes -= numOf5*500;
        int numOf2 = changes/200;
        changes -= numOf2*200;
        int numOf1 = changes/100;
        changes -= numOf1*100;
        int numOf_50 = changes/50;
        changes -= numOf_50*50;
        int numOf_20 = changes/20;
        changes -= numOf_20*20;
        int numOf_10 = changes/10;
        System.out.println("The changes amount is:");
        System.out.printf("%dx 5 euro bill(s), %dx 2 euro coin(s), %dx 1 euro coin(s)," +
                "%dx 50 cents coin(s), " +  "%dx 20 cents coin(s), %dx 10 cents coin(s)",
                numOf5, numOf2, numOf1, numOf_50, numOf_20, numOf_10);

        scanner.close();
    }
}
