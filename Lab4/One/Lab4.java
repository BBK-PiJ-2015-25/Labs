
import java.util.Scanner;

public class Lab4 { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
            // Lab 4.3 - Binary and Decimal

            System.out.println("Lab 4.3 - Binary and Decimal");
        String option;
        int optionInt;
        BandD item;
        System.out.println("Would you like to:");
        System.out.println("1. Convert binary to decimal");
        System.out.println("2. Convert decimal to binary");
        option = System.console().readLine();
        optionInt = Integer.parseInt(option);
        item = new BandD();
        if (optionInt == 1) {
            item.binary2decimal();
        } else if (optionInt == 2) {
            item.decimal2binary();
        } else {
            System.out.println("Invalid selection. Try again.");
        }
        System.out.println("End.");
    }
    static class BandD {
        int power(int base, int exponent) {
            System.out.println("Power");
        }
        int power2(int exponent) {
            System.out.println("Power2");
        }
        double binary2decimal(String input) {
            System.out.println("Binary2decimal");
        }
        String decimal2binary(double input) {
            System.out.println("Decimal2binary");
        }
    }
}