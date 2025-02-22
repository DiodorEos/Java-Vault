public class ex37_PatternPrinting {
    public static void main(String[] args) {
        for(int i=1; i<=10; i += 2) {
            int a = 0, b = 0;
            while (a < 10) {
                System.out.print("*_");
                a++;
            }
            System.out.println();
            while (b < 10) {
                System.out.print("_*");
                b++;
            }
            System.out.println();
        }
    }
}