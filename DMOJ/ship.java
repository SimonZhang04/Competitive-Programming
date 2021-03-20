import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String parts = input.nextLine();
        boolean b = true;
        boolean f = true;
        boolean t = true;
        boolean l = true;
        boolean c = true;
        for(int i = 0; i < parts.length(); i++) {
            switch (parts.charAt(i)) {
                case 'B':
                    b = false;
                    break;
                case 'F':
                    f = false;
                    break;
                case 'T':
                    t = false;
                    break;
                case 'L':
                    l = false;
                    break;
                case 'C':
                    c = false;
                    break;
            }
        }
        if (b) {
            System.out.print("B");
        }
        if (f) {
            System.out.println("F");
        }
        if (t) {
            System.out.println("T");
        }
        if (l) {
            System.out.println("L");
        }
        if (c) {
            System.out.println("C");
        }
        if (b == false && f == false && t == false && l == false && c == false) {
            System.out.println("NO MISSING PARTS");
        }
    }
    
}
