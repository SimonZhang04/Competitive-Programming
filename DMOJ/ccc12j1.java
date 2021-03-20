import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int speedLimit = input.nextInt();
        int recordedSpeed = input.nextInt();
        int difference = recordedSpeed - speedLimit;
        if (difference >= 1 && difference <= 20) {
            System.out.println("You are speeding and your fine is $100.");
        } else if (difference >= 21 && difference <= 30) {
            System.out.println("You are speeding and your fine is $270.");
        } else if (difference >= 31) {
            System.out.println("You are speeding and your fine is $500.");
        } else {
            System.out.println("Congratulations, you are within the speed limit!");
        }
       
    }
    
}
