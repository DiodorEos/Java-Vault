import java.util.Random;

public class ex32_ConsonantMaking {
    public static void main(String[] args) {
        Random random = new Random(); // Creating random letters for variety.
        int i = 0;
        while (i < 10) {
            char letter = (char) (random.nextInt(26) + 65); // Ascii capital 'A' at no. 65

            if (letter != 'A' && letter != 'E' && letter != 'I' && letter != 'O' && letter != 'U') {
                System.out.print(letter + " ");
                i++;
            }
        }
    }
}
