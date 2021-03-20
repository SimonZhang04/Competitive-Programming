import java.util.Scanner;

public class PurchasingPresents {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double c = input.nextDouble();
        double sum = 0;
        for (int i = 0; i < n; i++) {
            double add = input.nextDouble();
            sum += add;
        }
        double money = (double)Math.round((c - sum) * 100000d) / 100000d;
        if (money < 0) {
            System.out.println("Fardin's broke");
        } else if (money == 0) {
            System.out.println("0.00");
        } else {
            System.out.println(money);
        }
    }
}
