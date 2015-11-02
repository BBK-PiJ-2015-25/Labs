
import java.util.Scanner;

public class Lab4 { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
            // Lab 4.7 - A bit more practice with doubles

            System.out.println("Lab 4.7 - A bit more practice with doubles");
        System.out.println("Enter the amount of your mortgage: ");
        String total = input.nextLine();
        double t = Double.parseDouble(total);
        System.out.println("Enter the interest rate: ");
        String interest = input.nextLine();
        double i = Double.parseDouble(interest);
        System.out.println("Enter the number of years: ");
        String years = input.nextLine();
        double y = Double.parseDouble(years);
        Mortgage mortgage = new Mortgage();
        mortgage.years = y;
        mortgage.total = t;
        mortgage.interest = i;
        System.out.println("The total amount to be paid on your mortgage is: " + mortgage.totalToBePaid());
        System.out.println("The amount to be paid per year is: " + mortgage.totalPerYear());
        System.out.println("The number of years before the interest is paid off: " + mortgage.yearsToPayInterest());
        System.out.println("Goodbye.");
    }
    static class Mortgage {
        double years;
        double total;
        double interest;
        double totalToBePaid() {
            double t = this.total * (1 + (this.interest / 100));
            return t;
        }
        double totalPerYear() {
            return this.totalToBePaid() / this.years;
        }
        double yearsToPayInterest() {
            double interestCost = this.totalToBePaid() - this.total;
            double interestYears = interestCost / this.totalPerYear();
            return interestYears;
        }
    }
}