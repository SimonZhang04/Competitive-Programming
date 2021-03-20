import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angle1 = input.nextInt();
        int angle2 = input.nextInt();
        int angle3 = input.nextInt();
        if (angle1 + angle2 + angle3 == 180) {
            if ((angle1 == 60) && (angle2 == 60)) {
                System.out.print("Equilateral");
            } else if ((angle1 == angle2) || (angle2 == angle3) || (angle1 == angle3)) {
           System.out.print("Isosceles");
        } else {
                System.out.print("Scalene");
            }
        } else {
            System.out.print("Error");
        }
    }
    
}
