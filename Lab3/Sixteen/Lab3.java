
import java.util.Scanner;

public class Lab3 { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Lab 3.16 - Text2number");
        System.out.println("Enter a number with a thousand separator (,) and two decimal places:");
        String num = input.nextLine();
        String number = num.replace(",", "");
        String[] parts = number.split("\\.");
        int thousands = Integer.parseInt(parts[0]);
        int decimal = Integer.parseInt(parts[1]);
        String half = (thousands / 2) + "." + (decimal / 2);
        System.out.println("Half your number is: " + half);
        System.out.println("Goodbye.");
    }
}