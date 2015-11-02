
import java.util.Scanner;

public class Lab4 { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
            // Lab 4.6 - Integer

            System.out.println("Lab 4.6 - Integer");
        Integer2 i2 = new Integer2();
        System.out.println("Enter a number: ");
        String str = System.console().readLine();
        int i = Integer.parseInt(str);
        i2.setValue(i);
        System.out.println("The number you entered is ");
        if (i2.isEven()) {
            System.out.println("even.");
        } else if (i2.isOdd()) {
            System.out.println("odd.");
        } else {
            System.out.println("undefined!! Your code is buggy!");
        }
        int parsedInt = Integer.parseInt(i2.toString());
        if (parsedInt == i2.getValue()) {
            System.out.println("Your toString() method seems to work fine.");
        }
        System.out.println("Goodbye.");
    }
    static class Integer2 {
        int value;
        int getValue() {
            return this.value;
        }
        void setValue(int item) {
            this.value = item;
        }
        boolean isEven() {
            if (this.value % 2 == 0) {
                return true;
            } else {
                return false;
            }
        }
        boolean isOdd() {
            if (this.value % 2 != 0) {
                return true;
            } else {
                return false;
            }
        }
        void prettyPrint() {
            System.out.println(this.value);
        }
        public String toString() {
            return this.value+"";
        }
    }
}