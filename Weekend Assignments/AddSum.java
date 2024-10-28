import java.util.Scanner;

public class AddSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String again;
        do {
            System.out.print("Enter the first number: ");
            int numberOne = input.nextInt();
            System.out.print("Enter the second number: ");
            int numberTwo = input.nextInt();
            int sum = numberOne + numberTwo;
            System.out.println("The sum is: " + sum);
            System.out.print("Do you want to perform another operation? (yes/no): ");
            again = input.next();
        } while (again.equalsIgnoreCase("yes"));
    }
}

