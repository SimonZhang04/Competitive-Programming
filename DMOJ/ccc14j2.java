import java.util.Scanner;

public class VoteCount {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        String takeAFrickingChill = input.nextLine();
        String votes = input.nextLine();
        int acount = 0;
        int bcount = 0;
        int a = votes.indexOf('A');
        int b = votes.indexOf('B');
        while (a != -1) {
            acount++;
            a = votes.indexOf("A", a + 1);
        }
        while (b != -1) {
            bcount++;
            b = votes.indexOf("B", b + 1);
        }
        if (acount == bcount) {
            System.out.print("Tie");
        } else if (acount > bcount) {
            System.out.print("A");
        } else {
            System.out.print("B");
        }

    }

}
