import java.util.Scanner;

public class Main {

    public static boolean isComposite(long number) {
        // write your code here
        boolean check = false;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                check = true;
                break;
            }
        }
        return check;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final long number = scanner.nextLong();
        System.out.println(isComposite(number));
    }
}