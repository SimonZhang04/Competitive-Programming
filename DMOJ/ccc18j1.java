import java.util.Scanner;


public class Main {

 
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int first = input.nextInt();
       int second = input.nextInt();
       int third = input.nextInt();
       int fourth = input.nextInt();
       if (second != third) {
           System.out.print("answer");
       } else if (first != 8 && first != 9) {
           System.out.print("answer");
       } else if (fourth !=8 && fourth != 9) {
           System.out.print("answer"); 
       } else {
                   System.out.print("ignore");
                   }
       }
       
    
}
