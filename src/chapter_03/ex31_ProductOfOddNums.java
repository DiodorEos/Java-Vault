public class ex31_ProductOfOddNums {
    public static void main(String[] args){
        int numProduct = 1;
        for (int i = 1; i <= 15; i += 2){
            numProduct *= i;
        }
        System.out.println("The product of odd numbers from 1 to 15 is: " + numProduct);
    }
}
