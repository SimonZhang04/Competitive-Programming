import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String shirt = input.nextLine();
        String pants = input.nextLine();
        int r = shirt.indexOf("red");
        int g = shirt.indexOf("green");
        int w = shirt.indexOf("white");
        int rr = pants.indexOf("red");
        int gg = pants.indexOf("green");
        int ww = pants.indexOf("white");
        if ((r != -1 || g != -1 || w != -1) && (rr != -1 || gg != -1 || ww != -1)) {
            System.out.print("Jingle Bells");
        } else {
            System.out.print("Boring...");
        }

    }

}
