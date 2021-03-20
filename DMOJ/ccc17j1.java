import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        if (x > 0 && y > 0) {
            int quad = 1;
            System.out.print(quad);
        } else if (x > 0 && y < 0) {
            int quad = 4;
            System.out.print(quad);
        } else if (x < 0 && y < 0) {
            int quad = 3;
            System.out.print(quad);
        } else {
            int quad = 2;
            System.out.print(quad);
        }
    }
    
}
