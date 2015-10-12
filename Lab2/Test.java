
import java.util.Scanner;

public class Test { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hello Dave!");
        System.out.println("Ente a number:");
        int num = input.nextInt();
        System.out.println("I entered "+num+". End.");
    }
}