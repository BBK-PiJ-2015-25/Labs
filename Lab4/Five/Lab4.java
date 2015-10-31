
import java.util.Scanner;

public class Lab4 { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
            // Lab 4.5 - More on points

            System.out.println("Lab 4.5 - More on points");
        Point point = new Point();
        point.x = 4.0;
        point.y = 5.0;
        Point pointTwo = new Point();
        pointTwo.x = 2.0;
        pointTwo.y = 2.0;
        double distance = point.distanceTo(pointTwo);
        System.out.println("distanceTo: " + distance);
        double distanceToOrigin = point.distanceToOrigin();
        System.out.println("distanceToOrigin: " + distanceToOrigin);
        point.moveTo(50, 50);
        System.out.println("Point x is now: " + point.x);
        System.out.println("Point y is now: " + point.y);
        Point temp = new Point();
        temp.x = 4;
        temp.y = 5;
        point.moveTo(temp);
        System.out.println("Point x is now: " + point.x);
        System.out.println("Point y is now: " + point.y);
        Point cloned = point.clonePoint();
        System.out.println("The x value of the cloned point is: " + cloned.x);
        System.out.println("The y value of the cloned point is: " + cloned.y);
        Point opposite = point.opposite();
        System.out.println("The x value of the opposite point is: " + opposite.x);
        System.out.println("The y value of the opposite point is: " + opposite.y);
        System.out.println("Goodbye.");
    }
    static class Point {
        double x;
        double y;
        double distanceTo(Point point) {
            double dist = (this.x - point.x) * (this.x - point.x) + (this.y - point.y) * (this.y - point.y);
            return dist;
        }
        double distanceToOrigin() {
            Point origin = new Point();
            origin.x = 0;
            origin.y = 0;
            double dist = this.distanceTo(origin);
            return dist;
        }
        void moveTo(double x, double y) {
            this.x = x;
            this.y = y;
        }
        void moveTo(Point point) {
            this.x = point.x;
            this.y = point.y;
        }
        Point clonePoint() {
            Point point = new Point();
            point.x = this.x;
            point.y = this.y;
            return point;
        }
        Point opposite() {
            Point cloned = this.clonePoint();
            cloned.x *= -1;
            cloned.y *= -1;
            return cloned;
        }
    }
}