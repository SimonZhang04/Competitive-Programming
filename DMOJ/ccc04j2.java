import java.util.Scanner;

public class TermsOfOffice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        System.out.println("All positions change in year " + x);
            while (x < y) {
            x += 60;
            if (x <= y) {
            System.out.println("All positions change in year " + x);

            }

        }

    }
}
