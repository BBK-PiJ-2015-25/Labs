
import java.util.Scanner;

public class Lab5 { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Lab5.2.3 - Hanoi towers");
        System.out.println("The number of moves for 64 discs is: " + hanoi(1, 64));
        System.out.println("Goodbye.");
    }

    private static int hanoi (int total, int discs) {
        if (discs == 0) {
            return total;
        } else {
            return hanoi(total*2+1, discs--);
        }
    }
}