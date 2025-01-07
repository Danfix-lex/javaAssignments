import java.util.Scanner;

public class CompoundInterestCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double principal = getPrincipal(input);
        double rate = getRate(input);
        int choice = getChoice(input);

        double timeInYears = 0;
        int compounded = 0;

        if (choice == 1) {
            timeInYears = getTimeInDays(input);
            compounded = 365;
        } else if (choice == 2) {
            timeInYears = getTimeInWeeks(input);
            compounded = 52;
        } else if (choice == 3) {
            timeInYears = getTimeInYears(input);
            compounded = 1;
        } else {
            System.out.println("Invalid choice! Exiting.");
            return;
        }

        System.out.print("Enter the monthly contribution (if none, enter 0): ");
        double monthlyContribution = input.nextDouble();

        System.out.print("Enter the monthly withdrawal (if none, enter 0): ");
        double monthlyWithdrawal = input.nextDouble();

        double totalAmount = calculateAmount(principal, rate, compounded, timeInYears, monthlyContribution, monthlyWithdrawal);
        double compoundInterest = calculateCompoundInterest(totalAmount, principal);

        displayResults(totalAmount, compoundInterest);
    }

    public static double getPrincipal(Scanner input) {
        System.out.print("Enter the principal amount: ");
        return input.nextDouble();
    }

    public static double getRate(Scanner input) {
        System.out.print("Enter the annual interest rate (in %): ");
        return input.nextDouble() / 100;
    }

    public static int getChoice(Scanner input) {
        System.out.print("Do you want to calculate for (1): Day(s), (2): Week(s), or (3): Year(s)? Enter 1, 2, or 3: ");
        return input.nextInt();
    }

    public static double getTimeInDays(Scanner input) {
        System.out.print("Enter the number of day(s): ");
        int days = input.nextInt();
        return days / 365.0;
    }

    public static double getTimeInWeeks(Scanner input) {
        System.out.print("Enter the number of week(s): ");
        int weeks = input.nextInt();
        return weeks / 52.0;
    }

    public static double getTimeInYears(Scanner input) {
        System.out.print("Enter the number of year(s): ");
        return input.nextDouble();
    }

    public static double calculateAmount(double principal, double rate, int compounded, double timeInYears, double monthlyContribution, double monthlyWithdrawal) {
        double totalAmount = principal * Math.pow(1 + (rate / compounded), compounded * timeInYears);
        double monthlyRate = rate / 12;
        int months = (int) (timeInYears * 12);
        for (int i = 0; i < months; i++) {
            totalAmount += monthlyContribution * Math.pow(1 + monthlyRate, months - i);
            totalAmount -= monthlyWithdrawal * Math.pow(1 + monthlyRate, months - i);
        }
        return totalAmount;
    }

    public static double calculateCompoundInterest(double totalAmount, double principal) {
        return totalAmount - principal;
    }

    public static void displayResults(double totalAmount, double compoundInterest) {
        System.out.printf("Total Amount: %.2f%n", totalAmount);
        System.out.printf("Compound Interest: %.2f%n", compoundInterest);
    }
}

