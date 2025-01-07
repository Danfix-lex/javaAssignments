import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = input.nextDouble();
        
        System.out.print("Enter the amount you plan to add every month, or a negative number for the amount that you plan to withdraw every month: ")
        double monthlyContribution = input.nextDouble();

        System.out.print("Enter the annual interest rate: ");
        double rate = input.nextDouble() / 100;

        System.out.print("Do you want to calculate for (1): Day(s) or (2): Week(s) or (3): Year(s)? Enter 1 or 2 or 3: ");
        int choice = input.nextInt();

        double timeInYears = 0;
        int compounded = 0;

        if (choice == 1) {
            System.out.print("Enter the number of day(s): ");
            int days = input.nextInt();
            timeInYears = days / 365.0;
            compounded = 365;
        } else if (choice == 2) {
            System.out.print("Enter the number of week(s): ");
            int weeks = input.nextInt();
            timeInYears = weeks / 52.0;
            compounded = 52;
        } else if (choice == 3) {
            System.out.print("Enter the number of year(s): ");
            int years = input.nextInt();
            timeInYears = years / 1.0;
            compounded = 365;
        } else {
            System.out.println("Invalid choice! Please try again.");
            return;
        }

        if (monthlyContribution > 0)

        double amount = principal * Math.pow(1 + (rate / compounded), compounded * timeInYears);
        double compoundInterest = amount - principal;

        System.out.printf("Total Amount: %.2f%n", amount);
        System.out.printf("Compound Interest: %.2f%n", compoundInterest);
    }
}
