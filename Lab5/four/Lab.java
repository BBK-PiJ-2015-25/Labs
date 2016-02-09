
import java.util.Scanner;

public class Lab { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
            // Lab 5.4 - Palindrome

            System.out.println("Lab 5.4 - Palindrome");
        System.out.println("Enter a string: ");
        String word = input.nextLine();
        if (palindrome(word)) {
            System.out.println("The word " + word + " is a palindrome.");
        } else {
            System.out.println("The word " + word + " is not a palindrome.");
        }
    }

    private static boolean palindrome(String word) {
        int l = word.length();
        if (l == 0 || l == 1) {
            return true;
        } else if (word.charAt(0) == word.charAt(l-1)) {
            return palindrome(word.substring(1, l-1));
        } else {
            return false;
        }
    }
}