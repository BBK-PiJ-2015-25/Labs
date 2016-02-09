
import java.util.Scanner;

public class Lab5 { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
            // Lab 5.5 - Power

            System.out.println("Lab 5.5 - Power");
        Maths maths = new Maths();
        System.out.println("Enter a number: ");
        int base = input.nextInt();
        System.out.println("Enter a power :");
        int exponent = input.nextInt();
        System.out.println("The sum of " + base + " to the power of " + exponent + " is " + maths.pow(base, exponent));
        System.out.println("Goodbye");
    }
    static class Maths {
        int pow(int base, int exponent) {
            if (exponent == 0) {
                return 1;
            } else if (exponent == 1) {
                return base;
            } else {
                return base * pow(base, exponent - 1);
            }
        }
    }
}