import java.util.Scanner;

public class UpAndDown {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int s = input.nextInt();
        int asteps = 0;
        int bsteps = 0;
        for (int xsteps = 0; xsteps < s;) {
            if (xsteps + a <= s) {
                asteps += a;
                xsteps += a;
            } else {
                xsteps += a;
                asteps += s;
                asteps += -1 * xsteps + a;
                break;
            }
            if (xsteps + b <= s) {
                asteps -= b;
                xsteps += b;
            } else {
                xsteps += b;
                asteps -= s;
                asteps -= -1 * xsteps + b;
                break;
            }
        }
        for (int ysteps = 0; ysteps < s;) {
            if (ysteps + c <= s) {
                bsteps += c;
                ysteps += c;
            } else {
                ysteps += c;
                bsteps += s;
                bsteps += -1 * ysteps + c;
                break;
            }
            if (ysteps + d <= s) {
                bsteps -= d;
                ysteps += d;
            } else {
                ysteps += d;
                bsteps -= s;
                bsteps -= -1 * ysteps + d;
                break;
            }
        }
        if (asteps == bsteps) {
            System.out.print("Tied");
        } else if (asteps < bsteps) {
            System.out.print("Byron");
        } else {
            System.out.print("Nikky");
        }
    }

}