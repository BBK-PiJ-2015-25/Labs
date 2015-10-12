
import java.util.Scanner;

public class Lab3 { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Starting Lab3.1");
        double d1 = 1.255;
        double d2 = d1 + 7 - 4 - 3;
        double d3 = d1 + 7;
        double d4 = d3 - 4;
        double d5 = d4 - 3;
        double d6 = (double)(d1 + 7 - 4 - 3);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
        System.out.println(d6);
        if (d1 == d2) {
            System.out.println("Equal: "+d1);
        } else {
            System.out.println("Not equal: "+d2);
        }
    }
}