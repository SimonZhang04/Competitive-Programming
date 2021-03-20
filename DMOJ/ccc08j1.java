import java.util.Scanner;

public class Main {

  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int weight = input.nextInt();
        double height = input.nextDouble();
        double bmi = weight/(height * height);
        if (bmi > 25) {
            System.out.print("Overweight");
        } else if (bmi >= 18.5 && bmi <= 25) {
            System.out.print("Normal weight");
        } else {
            System.out.print("Underweight");
        }
    }
    
}
