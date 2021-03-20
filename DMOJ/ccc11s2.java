import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String no = input.nextLine();
        int n = Integer.parseInt(no);
        int count = 0;
        String[] respond = new String[n];
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            respond[i] = input.nextLine();
        }
        for (int q = 0; q < n; q++) {
            answer[q] = input.nextLine();
            if (respond[q].equals(answer[q])) {
                count++;
            } 
        }
        System.out.println(count);
    }
}