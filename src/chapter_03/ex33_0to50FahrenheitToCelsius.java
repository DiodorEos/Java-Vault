public class ex33_0to50FahrenheitToCelsius {
    public static void main(String[] args) {
        // table of temperatures 0 - 50 F to C
        for (int i = 0; i <= 50; i++) {
            System.out.printf("\t%d Fahrenheit\t=>\t%d Celsius\n", i, Math.round((i - 32) * 5 / 9.0f));
        }
    }
}
