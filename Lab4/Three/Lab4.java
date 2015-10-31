
import java.util.Scanner;

public class Lab4 { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
            // Lab 4.3 - Binary and Decimal

            System.out.println("Lab 4.3 - Binary and Decimal");
        String option;
        int optionInt;
        BandD bandd;
        System.out.println("Would you like to:");
        System.out.println("1. Convert binary to decimal");
        System.out.println("2. Convert decimal to binary");
        option = System.console().readLine();
        optionInt = Integer.parseInt(option);
        bandd = new BandD();
        if (optionInt == 1) {
            System.out.println("Please enter your binary sequence: ");
            String binary = input.nextLine();
            double item = bandd.binary2decimal(binary);
            System.out.println("The decimal of the binary '" + binary + "' is '" + item + "'");
        } else if (optionInt == 2) {
            System.out.println("Please enter your decimal: ");
            String d = input.nextLine();
            double dec = Double.parseDouble(d);
            String binary = bandd.decimal2binary(dec);
            System.out.println("The binary representation of " + dec + " is '" + binary + "'");
        } else {
            System.out.println("Invalid selection. Try again.");
        }
        System.out.println("End.");
    }
    static class BandD {
        int power(int base, int exponent) {
            double b = (double) base;
            double e = (double) exponent;
            int power = (int) Math.pow(base, exponent);
            return power;
        }
        int power2(int exponent) {
            return this.power(2, exponent);
        }
        double binary2decimal(String input) {
            String digits[] = input.split("");
            int l = digits.length;
            int total = 0;
            for (int i = 0; i < l; i++) {
                if (digits[i].equals("0")) {
                continue;
                }
                total += this.power2(i);
            }
            return total;
        }
        String decimal2binary(double input) {
            String binary = "";
            double n = input;
            while (n > 0) {
                double i = n * 2;
                System.out.println(i);
                if (i >= 1) {
                    binary += "1";
                    n = i - 1.0;
                    System.out.println(n);
                } else {
                    binary += "0";
                    n = i;
                    System.out.println(n);
                }
            }
            return binary;
        }
    }
}