import java.util.Scanner;


public class ShiftySum {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start = input.nextInt();
        int shift = input.nextInt();
        int sum = 0;
        for (int i = 0; i <= shift; i++) {
        sum += (Math.pow(10, i) * start); 
        }
        System.out.print(sum);
    }
    
}
