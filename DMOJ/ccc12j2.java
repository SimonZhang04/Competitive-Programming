import java.util.Scanner;


public class SoundsFishy {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int one = input.nextInt();
        int two = input.nextInt();
        int three = input.nextInt();
        int four = input.nextInt();
        if (one == two && three == four && one == three) {
            System.out.println("Fish At Constant Depth");
        } else if (one > two && two > three && three > four) {
            System.out.println("Fish Diving");
        } else if (one < two && two < three && three < four) {
            System.out.println("Fish Rising");
        } else {
            System.out.println("No Fish");
        }
    }
    
}
