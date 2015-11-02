
import java.util.Scanner;

public class Lab3 { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Lab 3.14 - Palindrome creator");
        System.out.println("Enter a sequence of words: ");
        String sentence = input.nextLine();
        String[] letters = sentence.split("");
        int l = letters.length;
        String reverse = "";
        for (int i = l-1; i >= 0; i--) {
            reverse += letters[i];
        }
        System.out.println(sentence+reverse);
        System.out.println("Goodbye.");
    }
}