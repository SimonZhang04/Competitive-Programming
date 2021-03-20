import java.util.Scanner;

public class AdmissionAverage {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int grades = 0;
        for(int i = 0; i < 6; i++) {
            int mark = input.nextInt();
            grades += mark;
        }
        int aif = input.nextInt();
        int iar = input.nextInt();
        double average = grades/6 + aif;
        if (average >= iar) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }     
    }
}
