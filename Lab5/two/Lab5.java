
import java.util.Scanner;

public class Lab5 { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Lab 5.2.2 - Fibonacci");
        System.out.println("Total: " + fibonacci(10));
        System.out.println("Goodbye.");
    }

    private static int fibonacci (int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            int result = fibonacci(n-1) + fibonacci(n-2);
            return result;
        }
    }
}