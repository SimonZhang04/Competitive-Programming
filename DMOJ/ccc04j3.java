import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int adjectives = input.nextInt();
        int nouns = input.nextInt();
        String[] adj = new String[adjectives];
        String[] noun = new String[nouns];
        for(int i = 0; i < adjectives; i++) {
            adj[i] = input.next();
        }
        for (int i = 0; i < nouns; i ++) {
            noun[i] = input.next();
        }
        for (int i = 0; i < adjectives; i++) {
            for (int q = 0; q < nouns; q++) {
                System.out.println(adj[i] + " as " + noun[q]);
            }
        }
    }
    
}
