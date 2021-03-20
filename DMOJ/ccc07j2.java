import java.util.Scanner;

public class CCC07J2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        String[] text = new String[100];
        while (run) {
            OUTER:
            for (int i = 0; i > -1; i++) {
                text[i] = input.nextLine();
                switch (text[i]) {
                    case "CCC":
                        System.out.println("Canadian Computing Competition");
                        break;
                    case "CU":
                        System.out.println("see you");
                        break;
                    case ":-)":
                        System.out.println("I'm happy");
                        break;
                    case ":-(":
                        System.out.println("I'm sad");
                        break;
                    case ";-)":
                        System.out.println("wink");
                        break;
                    case ":-P":
                        System.out.println("stick out my tongue");
                        break;
                    case "(~.~)":
                        System.out.println("sleepy");
                        break;
                    case "TA":
                        System.out.println("totally awesome");
                        break;
                    case "CUZ":
                        System.out.println("because");
                        break;
                    case "TY":
                        System.out.println("thank-you");
                        break;
                    case "YW":
                        System.out.println("you're welcome");
                        break;
                    case "TTYL":
                        System.out.println("talk to you later");
                        System.exit(0);
                    default:
                        System.out.println(text[i]);
                        break;
                }
            }
        }
    }
}
