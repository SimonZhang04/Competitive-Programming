import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int happy = -1;
        int sad = -1;
        String message = input.nextLine();
        for (int i = 0; i < message.length() - 2; i++) {
           if (message.charAt(i) == ':' && message.charAt(i+1) == '-' && message.charAt(i+2) == ')') {
               happy++;
           } else if (message.charAt(i) == ':' && message.charAt(i+1) == '-' && message.charAt(i+2) == '(') {
               sad++;
           }
        } 
        if (happy > sad) {
            System.out.print("happy");
        } else if (happy < sad) {
            System.out.print("sad"); 
        } else if (happy == - 1 && sad == -1) {
            System.out.print("none");
        } else if (happy == sad) {
            System.out.print("unsure");
        }
        

    }
    
}
