import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double day = input.nextInt();
        double day1 = day;
        double day2 = day;
        if (day1 < 100) {
            day1 = 100;
        }
        if (day2 < 250) {
            day2 = 250;
        }
        double even = input.nextInt();
        double end = input.nextInt();
        double planA = ((25 * (day1 - 100) + 15 * even + 20 * end)/100);
        double planB = ((45 * (day2 - 250) + 35 * even + 25 * end)/100);
            System.out.println("Plan A costs " + planA);
            System.out.println("Plan B costs " + planB);
        if (planB < planA) {
        System.out.print("Plan B is cheapest.");
        } else if (planB == planA) {
            System.out.print("Plan A and B are the same price.");
        } else {
            System.out.print("Plan A is cheapest.");
        }

    }
    
}
