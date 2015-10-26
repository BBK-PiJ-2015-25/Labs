
import java.util.Scanner;

public class Lab5 { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Lab 5.1b - Recursive code, line by line");
        System.out.println(buggyMethod(9));
        System.out.println("Goodbye.");
    }

    private static String buggyMethod(int n) {
        if (n == 0) {
            return "";
        }
        return n + "" + buggyMethod(n-2);
    }
}