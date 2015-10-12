
import java.util.Scanner;

public class Lab3 { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Lab 3.4 - Distance point-to-point");
        int i = 3;
        double biggest = 0;
        double total   = 0;
        String userX;
        String userY;
        Point pos;
        for (int x = 0; x < i; x++) {
            pos = new Point();
            System.out.println("Enter a value for x:");
            userX = System.console().readLine();
            pos.x = Double.parseDouble(userX);
            System.out.println("Enter a value for y:");
            userY = System.console().readLine();
            pos.y = Double.parseDouble(userY);
            total = (pos.x*1 - pos.x*2)*2 + (pos.y*1 - pos.y*2)*2;
            System.out.println("Total: " + total);
            System.out.println("y: " + pos.y);
        }
        System.out.println("Goodbye.");
    }
    static class Point {
        double x;
        double y;
    }
}