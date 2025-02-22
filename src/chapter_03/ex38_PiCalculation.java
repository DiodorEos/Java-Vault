public class ex38_PiCalculation {
    public static void main(String[] args) {
        double pi = 0.0;
        int i = 0;
        int termsFor314 = 0;
        int termsFor3141 = 0;
        boolean found314 = false;

        System.out.println("Term: Approximation");
        System.out.println("--------------------");
        while (i < 1700) {
            if (i % 2 == 0) {
                pi = pi + 4.0 / (2 * i + 1);
            } else {
                pi = pi - 4.0 / (2 * i + 1);
            }

            System.out.printf("%d: %.6f%n", (i + 1), pi);

            if (!found314 && pi >= 3.14 && pi < 3.141) {
                termsFor314 = i + 1;
                found314 = true;
            }
            if (pi >= 3.141 && pi < 3.1411) {
                termsFor3141 = i + 1;
                break;
            }

            i++;
        }
        System.out.println("\nResults:");
        System.out.println("Terms needed for 3.14: " + termsFor314);
        System.out.println("Terms needed for 3.141: " + termsFor3141);
    }
}