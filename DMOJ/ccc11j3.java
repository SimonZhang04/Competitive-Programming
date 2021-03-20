import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] sequence = new int[50];
        sequence[0] = input.nextInt();
        sequence[1] = input.nextInt();
        int count = 2;
        for (int i = 2; i > 0; i++) {
            sequence[i] = sequence[i - 2] - sequence[i - 1];
            if (sequence[i] < 0) {
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}