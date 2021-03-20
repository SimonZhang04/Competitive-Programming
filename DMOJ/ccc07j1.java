import java.util.Scanner;

public class Main {

  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstBowl = input.nextInt();
        int secondBowl = input.nextInt();
        int thirdBowl = input.nextInt();
        if ((firstBowl > secondBowl && firstBowl < thirdBowl) || (firstBowl < secondBowl && firstBowl > thirdBowl)){
            System.out.print(firstBowl);
        } else if ((secondBowl > firstBowl && secondBowl < thirdBowl) || (secondBowl < firstBowl && secondBowl > thirdBowl)){
            System.out.print(secondBowl);
        } else {
            System.out.print(thirdBowl);
        }
    
    }
    
}
