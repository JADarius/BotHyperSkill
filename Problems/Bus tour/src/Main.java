import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        int height = scan.nextInt();
        int nr = scan.nextInt();
        int i = 1;
        for (i = 1; i <= nr; i++) {
            int brh = scan.nextInt();
            if (height >= brh) {
                System.out.println("Will crash on bridge " + i);
                break;
            }
        }
        if (i > nr) {
            System.out.println("Will not crash");
        }
    }
}