import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        boolean check = true;
        boolean des = x > y;
        while (true) {
            x = y;
            y = scan.nextInt();
            if (y == 0)
                break;
            if ((des && x < y) || (!des && x > y)) {
                check = false;
                break;
            }
        }
        System.out.println(check);
    }
}