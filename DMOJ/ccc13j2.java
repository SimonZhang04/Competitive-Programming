import java.util.Scanner;

public class RotatingLetters {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sign = input.nextLine();
        int count = 0;
        for (int i = 0; i < sign.length(); i++) {
            if (sign.charAt(i) != 'I' && sign.charAt(i) != 'O' && sign.charAt(i) != 'S' && sign.charAt(i) != 'H' && sign.charAt(i) != 'Z' && sign.charAt(i) != 'X' && sign.charAt(i) != 'N') {
                count++;
            }
        }
        if (count == 0) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }

    }
}
