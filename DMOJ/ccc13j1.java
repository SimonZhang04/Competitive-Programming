import java.util.Scanner;


public class Main {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int young = input.nextInt();
        int middle = input.nextInt();
        int age = middle * 2 - young;
        System.out.print(age);
    }
    
}
