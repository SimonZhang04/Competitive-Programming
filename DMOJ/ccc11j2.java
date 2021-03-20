import java.util.Scanner;

public class WhoHasSeenTheWind {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int h = input.nextInt();
        int m = input.nextInt();
        for (int t = 1; t <= m; t++) {
            double a = -6 * (Math.pow(t, 4)) + h * (Math.pow(t, 3)) + 2 * (Math.pow(t, 2)) + t;
            if (a <= 0) {
                System.out.println("The balloon first touches ground at hour:");
                System.out.println(t);
                System.exit(0);
            }
        }
        System.out.println("The balloon does not touch ground in the given time.");
    }
}