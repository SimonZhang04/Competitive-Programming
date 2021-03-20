import java.util.Arrays;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] playlist = {"A", "B", "C", "D", "E", " "};
        boolean ok = true;
        while (ok) {
            int button = input.nextInt();
            int times = input.nextInt();
            if (button == 3) {
                for (int i = 0; i < times; i++) {
                    playlist[5] = playlist[0];
                    playlist[0] = playlist[1];
                    playlist[1] = playlist[5];
                }
            } else if (button == 4) {
                for(int i = 0; i < playlist.length - 2; i++) {
                    System.out.print(playlist[i] + " ");
                } System.out.print(playlist[4]);
                break;
            } else if (button == 2) {
                for (int q = 0; q < times; q++) {
                    String temp = playlist[4];
                    for (int i = 4; i > 0; i--) {
                        playlist[i] = playlist[i - 1];
                    }
                    playlist[0] = temp;
                }
            } else if (button == 1) {
                for (int q = 0; q < times; q++) {
                    playlist[5] = playlist[0];
                    System.arraycopy(playlist, 1, playlist, 0, playlist.length - 1);
                }
            }
        }
    }
}
