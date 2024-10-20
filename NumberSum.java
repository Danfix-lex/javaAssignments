import java.util.Scanner;

public class NumberSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String again;

        do {
            System.out.print("Enter first number: ");
            double numOne = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double numTwo = scanner.nextDouble();
            double total = numOne + numTwo;
            System.out.println("The sum is: " + total);

            System.out.print("Do you want to perform the operation again? (yes/no): ");
            again = scanner.next();
        } while (again.equalsIgnoreCase("yes"));

    }
}
