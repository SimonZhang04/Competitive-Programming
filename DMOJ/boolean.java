import java.util.Scanner;

public class Boolean {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String something = input.nextLine();
        int not = 0;
        int yes = something.indexOf("True");
        if (yes < 0) {
            not++;
        }
        for (int i = 0; i < something.length(); i++) {
            if (something.charAt(i) == ' ') {
                not++;
            }
        }
        if (not % 2 == 0) {
            System.out.print("True");
        } else {
            System.out.print("False");
        }
    }
}
