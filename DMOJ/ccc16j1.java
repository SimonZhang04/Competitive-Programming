import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int win = 0;
        String[] games = new String[6];
        for (int i = 0; i < games.length; i++) {
            games[i] = input.nextLine();
        }
        for (int i = 0; i < games.length; i++) {
            if (games[i].equals("W")) {
                win++;
            } 
        }
        if ((win == 5) || (win == 6)) {
            System.out.print(1);
        } else if ((win == 3) || (win == 4)) {
            System.out.print(2);
        } else if ((win == 2) || (win == 1)) {
            System.out.print(3);
        } else {
            System.out.print(-1);
        }
        
    }
    
}
