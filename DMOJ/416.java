import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String phone = input.nextLine();
        if (phone.length() == 11) {
            if (phone.charAt(0) == '4' && phone.charAt(1) == '1' && phone.charAt(2) == '6') {
                System.out.print("valuable");
            } else if (phone.charAt(0) == '6' && phone.charAt(1) == '4' && phone.charAt(2) == '7') {
                System.out.print("valueless");
            } else if (phone.charAt(0) == '4' && phone.charAt(1) == '3' && phone.charAt(2) == '7') {
                System.out.print("valueless");
            } else {
                System.out.print("invalid");
            }
        } else {
            System.out.print("invalid");
        }
    }
}
