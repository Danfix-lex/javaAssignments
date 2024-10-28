import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the name of the first citizen: ");
        String citizenOne = input.nextLine();
        System.out.print("Enter " + citizenOne + "'s earnings: ");
        double earningsOne = input.nextDouble();
        double taxOne;
        if (earningsOne <= 30000) {
            taxOne = earningsOne * 0.15;
        } else {
            taxOne = 30000 * 0.15 + (earningsOne - 30000) * 0.20;
        }
        System.out.println("Total tax for " + citizenOne + ": " + taxOne);

        input.nextLine();
        System.out.print("Enter the name of the second citizen: ");
        String citizenTwo = input.nextLine();
        System.out.print("Enter " + citizenTwo + "'s earnings: ");
        double earningsTwo = input.nextDouble();
        double taxTwo;
        if (earningsTwo <= 30000) {
            taxTwo = earningsTwo * 0.15;
        } else {
            taxTwo = 30000 * 0.15 + (earningsTwo - 30000) * 0.20;
        }
        System.out.println("Total tax for " + citizenTwo + ": " + taxTwo);

        input.nextLine();
        System.out.print("Enter the name of the third citizen: ");
        String citizenThree = input.nextLine();
        System.out.print("Enter " + citizenThree + "'s earnings: ");
        double earningsThree = input.nextDouble();
        double taxThree;
        if (earningsThree <= 30000) {
            taxThree = earningsThree * 0.15;
        } else {
            taxThree = 30000 * 0.15 + (earningsThree - 30000) * 0.20;
        }
        System.out.println("Total tax for " + citizenThree + ": " + taxThree);
    }
}

