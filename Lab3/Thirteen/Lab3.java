
import java.util.Scanner;

public class Lab3 { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Lab 3.13 - Palindrome");
        System.out.println("Enter a sequence of words: ");
        String sentence = input.nextLine();
        String[] letters = sentence.split("");
        int l = letters.length;
        String reverse = "";
        for (int i = l-1; i >= 0; i--) {
            reverse += letters[i];
        }
        if (sentence.equals(reverse)) {
            System.out.println("You have a palindrome");
        } else {
            System.out.println("You do not have a palindrome");
        }
        System.out.println("Goodbye.");
    }
}