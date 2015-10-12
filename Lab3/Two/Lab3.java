
import java.util.Scanner;

public class Lab3 { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Lab 3.2 - Calculator");
        String firstItem;
        String secondItem;
        double first;
        double second;
        String operator;
        int actionType;
        double result = 0.0;
        int addAction      = 1;
        int multiplyAction = 2;
        int divideAction   = 3;
        int subtractAction = 4;
        System.out.println("Please enter a number:");
        firstItem = System.console().readLine();
        first = Double.parseDouble(firstItem);
        System.out.println("Please enter another number:");
        secondItem = System.console().readLine();
        second = Double.parseDouble(secondItem);
        System.out.println("Pick an operator:");
        System.out.println("1 - Add");
        System.out.println("2 - Multiply");
        System.out.println("3 - Divide");
        System.out.println("4 - Subtract");
        operator   = System.console().readLine();
        actionType = Integer.parseInt(operator); 

if (actionType == 1) {
            result = first + second;
        } else if (actionType == 4) {
            result = first - second;
        } else if (actionType == 2) {
            result = first * second;
        } else if (actionType == 3) {
            result = first / second;
        } else {
            System.out.println("You did not end one of the operators. You fail.");
        }
        System.out.println("The result is: " + result);
    }
}