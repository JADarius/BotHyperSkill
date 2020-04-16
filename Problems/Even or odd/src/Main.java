import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        while (x != 0) {
            if (x % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
            x = scan.nextInt();
        }
    }
}