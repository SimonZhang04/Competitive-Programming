import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int burger = input.nextInt();
        int side = input.nextInt();
        int drink = input.nextInt();
        int dessert = input.nextInt();
        int burgerCal;
        int sideCal;
        int drinkCal;
        int dessertCal;
        switch (burger) {
            case 1:
                burgerCal = 461;
                break;
            case 2:
                burgerCal = 431;
                break;
            case 3:
                burgerCal = 420;
                break;
            default:
                burgerCal = 0;
                break;
        }
       switch (side) {
            case 1:
                sideCal = 100;
                break;
            case 2:
                sideCal = 57;
                break;
            case 3:
                sideCal = 70;
                break;
            default:
                sideCal = 0;
                break;
       }
        switch (drink) {
            case 1:
                drinkCal = 130;
                break;
            case 2:
                drinkCal = 160;
                break;
            case 3:
                drinkCal = 118;
                break;
            default:
                drinkCal = 0;
                break;
    }
        switch (dessert) {
            case 1:
                dessertCal = 167;
                break;
            case 2:
                dessertCal = 266;
                break;
            case 3:
                dessertCal = 75;
                break;
            default:
                dessertCal = 0;
                break;
        }
        int totalCal = burgerCal + sideCal + drinkCal + dessertCal;
    System.out.println ("Your total Calorie count is " + totalCal + ".");
}
}
