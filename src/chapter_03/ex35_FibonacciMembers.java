public class ex35_FibonacciMembers {
    public static void main(String[] args) {
        int f_first = 0;
        int f_second = 1;
        int f_num;
        System.out.print("The Fibonacci numbers that are less than 100 are: " + f_first + " " + f_second + " ");

        while ((f_num = f_first + f_second) < 100) {
            System.out.print(f_num + " ");
            f_first = f_second;
            f_second = f_num;
        }
    }
}
